package com.example.global.common.microservice.dto;

import com.example.global.common.microservice.constant.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel(description = "Common Response")
public class Response<T> {

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeFormat.US_LOCAL_DATE_TIME)
  private LocalDateTime timestamp;

  private Integer code;

  private String status;

  private String message;

  private T data;
}
