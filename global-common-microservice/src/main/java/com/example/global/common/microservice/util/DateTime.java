package com.example.global.common.microservice.util;

import com.example.global.common.microservice.constant.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

  public Date getCurrentDateTime() {

    String format = DateTimeFormat.US_LOCAL_DATE_TIME;
    String today = new SimpleDateFormat(format).format(new Date());

    try {
      return new SimpleDateFormat(format).parse(today);
    } catch (ParseException e) {
    }

    return null;
  }
}
