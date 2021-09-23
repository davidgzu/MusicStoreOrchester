package com.project.orchesterone.controller;

import com.project.orchesterone.dto.AlbumDTO;
import com.project.orchesterone.dto.ResponseDTO;
import com.project.orchesterone.dto.SaleDTO;
import com.project.orchesterone.service.MaganerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrchesterController {

  @Autowired
  private MaganerService maganerService;

  @GetMapping("/listAll")
  public ResponseDTO<List<AlbumDTO>> toList(){
    return maganerService.findAll();
  }

  @PostMapping("/sale")
  public ResponseDTO sale(@RequestBody SaleDTO saleDTO){
    System.out.println(saleDTO.getIdClient());
    return maganerService.sale(saleDTO);
  }

}
