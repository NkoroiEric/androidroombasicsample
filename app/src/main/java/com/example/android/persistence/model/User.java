package com.example.android.persistence.model;

import java.util.Date;

/**
 * Created by nkoroi on 31/05/17.
 */

public interface User {

  int getId();
  String getName();
  Date getDateOfBirth();
  Date getTimestamp();

}
