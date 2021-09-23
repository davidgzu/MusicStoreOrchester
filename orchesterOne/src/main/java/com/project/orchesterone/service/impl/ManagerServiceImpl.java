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

import static com.example.demoorquestados.utils.Constants.ALBUM;
import static com.example.demoorquestados.utils.Constants.HTTPHEADERS_APPLICATION;
import static com.example.demoorquestados.utils.Constants.HTTPHEADERS_CONTENT;
import static com.example.demoorquestados.utils.Constants.NO_STOCK;
import static com.example.demoorquestados.utils.Constants.QUANTITY_AVAILABLE_PARAMETER;
import static com.example.demoorquestados.utils.Constants.READY;
import static com.example.demoorquestados.utils.Constants.RESULT;
import static com.example.demoorquestados.utils.Constants.URL_ALBUMS_GENERAL;
import static com.example.demoorquestados.utils.Constants.URL_ALBUMS_ID;

@Service
public class ManagerServiceImpl implements MaganerService {

  @Autowired
  private RestTemplate clientRest;


  @Override
  public ResponseDTO<List<AlbumDTO>> findAll() {
    ResponseEntity<Object> response = clientRest.exchange(URL_ALBUMS_GENERAL, HttpMethod.GET, null, Object.class);
    ResponseDTO responseDTO = new ResponseDTO(response.getBody());
    return responseDTO;
  }

  @Override
  public ResponseDTO sale(SaleDTO saleDTO) {
    String sale = "";
    for (AlbumSale albumSale : saleDTO.getAlbums()) {
      try {
        ResponseEntity<Object> response = clientRest.exchange(URL_ALBUMS_ID, HttpMethod.GET, null, Object.class, albumSale.getId());
        sale += ALBUM + albumSale.getId() + READY;
        restQuantityAlbum(albumSale);
      } catch (HttpClientErrorException exception) {
        sale += ALBUM + albumSale.getId() + NO_STOCK;
      }
    }
    return new ResponseDTO(Constants.ResponseConstants.SUCCESS, RESULT, sale);
  }

  public void restQuantityAlbum(AlbumSale albumSale){
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.set(HTTPHEADERS_CONTENT, HTTPHEADERS_APPLICATION);
    Map<String, Integer> values = new HashMap<>();
    values.put(QUANTITY_AVAILABLE_PARAMETER, albumSale.getQuantity());
    HttpEntity httpEntity = new HttpEntity(values, httpHeaders);
    ResponseEntity<Object> response = clientRest.exchange(URL_ALBUMS_ID, HttpMethod.PUT, httpEntity, Object.class, albumSale.getId());

  }
}
