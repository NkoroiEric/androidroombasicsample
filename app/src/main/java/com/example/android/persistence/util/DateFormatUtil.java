package com.example.android.persistence.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nkoroi on 01/06/17.
 */

public class DateFormatUtil {
  private final Date date;
  String form;

  public DateFormatUtil(Date date) {
    this.date = date;
  }

  public String getForm() {
    return new SimpleDateFormat("yyyy-dd-MM hh:mm a").format(date);
  }
}
