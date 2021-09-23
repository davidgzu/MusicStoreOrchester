package com.project.orchesterone.service.impl;

import com.example.demoorquestados.utils.Constants;
import com.project.orchesterone.dto.AlbumDTO;
import com.project.orchesterone.dto.AlbumSale;
import com.project.orchesterone.dto.ResponseDTO;
import com.project.orchesterone.dto.SaleDTO;
import com.project.orchesterone.service.MaganerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements MaganerService {

  @Autowired
  private RestTemplate clientRest;
  String url = "http://localhost:8080/albums";
  String url2 = "http://localhost:8080/albums/{id}";

  @Override
  public ResponseDTO<List<AlbumDTO>> findAll() {
    ResponseEntity<Object> response = clientRest.exchange(url, HttpMethod.GET, null, Object.class);
    ResponseDTO responseDTO = new ResponseDTO(response.getBody());
    return responseDTO;
  }

  @Override
  public ResponseDTO sale(SaleDTO saleDTO) {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.set("Content-Type", "application/json");
    String sale = "";
    for (AlbumSale albumSale : saleDTO.getAlbums()) {
      try {
        ResponseEntity<Object> response = clientRest.exchange(url2, HttpMethod.GET, null, Object.class, albumSale.getId());
        sale += "Album: " + albumSale.getId() + " Listo ";
        Map<String, Integer> values = new HashMap<>();
        values.put("quantityAvailable", albumSale.getQuantity());
        HttpEntity httpEntity = new HttpEntity(values, httpHeaders);
        response = clientRest.exchange(url2, HttpMethod.PUT, httpEntity, Object.class, albumSale.getId());
        System.out.println(response);
      } catch (HttpClientErrorException exception) {
        sale += "Album: " + albumSale.getId() + " no esta, ";
      }
    }
    return new ResponseDTO(Constants.ResponseConstants.SUCCESS, "Resultado", sale);
  }
}
