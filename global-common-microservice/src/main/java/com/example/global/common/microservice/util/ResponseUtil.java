package com.example.global.common.microservice.util;

import com.example.global.common.microservice.dto.Response;

import java.time.LocalDateTime;

public class ResponseUtil {

  public static Response<Object> getResponse(Integer code, String status, String message, Object data) {
    Response<Object> response = new Response<Object>();
    response.setTimestamp(LocalDateTime.now());
    response.setCode(code);
    response.setStatus(status);
    response.setMessage(message);
    if (data != null) {
      response.setData(data);
    }

    return response;

  }
}
