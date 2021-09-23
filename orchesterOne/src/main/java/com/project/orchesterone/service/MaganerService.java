package com.project.orchesterone.service;

import com.project.orchesterone.dto.AlbumDTO;
import com.project.orchesterone.dto.ResponseDTO;
import com.project.orchesterone.dto.SaleDTO;

import java.util.List;

public interface MaganerService {

  ResponseDTO<List<AlbumDTO>> findAll();

  ResponseDTO sale(SaleDTO saleDTO);
}
