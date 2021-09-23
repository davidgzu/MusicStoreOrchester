package com.project.orchesterone.dto;


import com.example.demoorquestados.utils.Constants;
import com.example.demoorquestados.utils.Constants.ResponseConstants;

public class ResponseDTO<T> {
  private Constants.ResponseConstants responseConstants;
  private String message;
  private T content;

  public ResponseDTO(ResponseConstants responseConstants, String message, T content) {
    this.responseConstants = responseConstants;
    this.message = message;
    this.content = content;
  }

  public ResponseDTO(T content){
    this.content = content;
  }

  public ResponseConstants getResponseConstants() {
    return responseConstants;
  }

  public void setResponseConstants(Constants.ResponseConstants responseConstants) {
    this.responseConstants = responseConstants;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

}
