package com.example.global.common.microservice.constant.enums;

import lombok.Getter;

@Getter
public enum Status {

  C_0("Failed", 0),
  C_1("Success", 1);

  private final String message;
  private final Integer code;

  Status(String message, Integer code) {
    this.message = message;
    this.code = code;
  }

}
