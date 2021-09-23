package com.project.orchesterone.dto;

import java.util.ArrayList;
import java.util.List;


public class SaleDTO {

  private int idClient;
  private List<AlbumSale> albums;

  public SaleDTO() {
    albums = new ArrayList<>();
  }

  public List<AlbumSale> getAlbums() {
    return albums;
  }

  public void setAlbums(List<AlbumSale> albums) {
    this.albums = albums;
  }

  public int getIdClient() {
    return idClient;
  }

  public void setIdClient(int idClient) {
    this.idClient = idClient;
  }
}
