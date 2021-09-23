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

  public static final String ALBUM_FOUND = "Album found.";
  public static final String ALBUM_NOT_FOUND = "Album not found.";
  public static final String ALBUM_CREATED = "Album created.";
  public static final String ALBUM_UPDATED = "Album updated.";
  public static final String ALBUM_DELETED = "Album updated.";

  public static final String SONG_FOUND = "Song found.";
  public static final String SONG_NOT_FOUND = "Song not found.";
  public static final String SONG_CREATED = "Song created.";
  public static final String SONG_UPDATED = "Song updated.";
  public static final String SONG_DELETED = "Song deleted.";

  public static final String ARTIST_FOUND = "Artist found.";
  public static final String ARTIST_NOT_FOUND = "Artist not found.";
  public static final String ARTIST_CREATED = "Artist created.";
  public static final String ARTIST_UPDATED = "Artist updated.";
  public static final String ARTIST_DELETED = "Artist deleted.";

  public static final String CAT_REPAYMENT_NOT_FOUND = "repayment type not found";
  public static final String CAT_REPAYMENT_FOUND = "repayment type found";
  public static final String CAT_REPAYMENT_CREATED = "repayment type created";
  public static final String CAT_REPAYMENT_UPDATED = "Repayment type updated";
  public static final String CAT_REPAYMENT_DELETED = " Repayment type deleted";

  public static final String REPAYMENT_DELETED = "Repayment deleted";
  public static final String REPAYMENT_NOT_FOUND = "Repayment not found";
  public static final String REPAYMENT_FOUND = "Repayment found";
  public static final String REPAYMENT_CREATED = "Repayment created";
  public static final String REPAYMENT_UPDATED = "Repayment updated";

  public static final String CAT_GENRE_DELETED = "Genre deleted";
  public static final String CAT_GENRE_NOT_FOUND = "Genre not found";
  public static final String CAT_GENRE_FOUND = "Genre found";
  public static final String CAT_GENRE_CREATED = "Genre created";
  public static final String CAT_GENRE_UPDATED = "Genre updated";

  public static final String INVOICE_FOUND = "Invoice found.";
  public static final String INVOICE_NOT_FOUND = "Invoice not found.";
  public static final String INVOICE_CREATED = "Invoice created.";
  public static final String INVOICE_UPDATED = "Invoice updated.";
  public static final String INVOICE_DELETED = "Invoice deleted.";

  public static final String INVOICE_ALBUM_CREATED = "Invoice album created";
  public static final String INVOICE_ALBUM_NOT_FOUND = "Invoice album not found";
  public static final String INVOICE_ALBUM_FOUND = "Invoice album found";
  public static final String INVOICE_ALBUM_UPDATE = "Invoice album update";
  public static final String INVOICE_ALBUM_DELETE = "Invoice album delete";
}
