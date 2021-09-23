package com.project.orchesterone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class SongDTO {
  private Long id;
  private String name;
  private String duration;
  private AlbumDTO albumDTO;
  private Boolean enabled;

  public SongDTO() {

  }

  public SongDTO(Long id, String name, String duration, AlbumDTO albumDTO, Boolean enabled) {
    this.id = id;
    this.name = name;
    this.duration = duration;
    this.albumDTO = albumDTO;
    this.enabled = enabled;
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

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AlbumDTO getAlbumDTO() {
    return albumDTO;
  }

  public void setAlbumDTO(AlbumDTO albumDTO) {
    this.albumDTO = albumDTO;
  }
}
