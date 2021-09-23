package com.example.demoorquestados.utils;

public class Constants {

  public enum ResponseConstants {
    SUCCESS("Successful"), FAILURE("Unsuccessful");

    private String description;

    ResponseConstants(final String description) {
      this.description = description;
    }

    public String getDescription() {
      return description;
    }
  }

  public static final String HTTPHEADERS_CONTENT = "Content-Type";
  public static final String HTTPHEADERS_APPLICATION = "application/json";
  public static final String RESULT = "Result";
  public static final String ALBUM = " Album ";
  public static final String READY = " ready ";
  public static final String NO_STOCK = "no stock";
  public static final String URL_ALBUMS_GENERAL = "http://localhost:8080/albums";
  public static final String URL_ALBUMS_ID = "http://localhost:8080/albums/{id}";
  public static final String QUANTITY_AVAILABLE_PARAMETER ="quantityAvailable";

  public static final String URL_CLIENT_ID = "http://localhost:8080/client/{id}";


}
