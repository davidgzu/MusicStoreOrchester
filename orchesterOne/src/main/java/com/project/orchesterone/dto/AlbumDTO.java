package com.project.orchesterone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AlbumDTO {

  private Long id;

  private String name;

  private Date yearCreation;

  private String description;

  private Boolean enabled;

  private Double price;

  private Integer quantityAvailable;

  private List<SongDTO> songList;


  public AlbumDTO() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getYearCreation() {
    return yearCreation;
  }

  public void setYearCreation(Date yearCreation) {
    this.yearCreation = yearCreation;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }

  public List<SongDTO> getSongList() {
    return songList;
  }

  public void setSongList(List<SongDTO> songList) {
    this.songList = songList;
  }
}
