package com.example.android.persistence.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import com.example.android.persistence.model.User;
import java.util.Date;

/**
 * Created by nkoroi on 31/05/17.
 */
@Entity(tableName = "users")
public class UserEntity  implements User{
  @PrimaryKey
  private  int id;
  private  String name;
  private  Date dateOfBirth;
  private  Date timestamp;

  public UserEntity() {
  }

  public UserEntity(User user) {
    this.id = user.getId();
    this.name = user.getName();
    this.dateOfBirth = user.getDateOfBirth();
    this.timestamp = user.getTimestamp();
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  @Override
  public Date getTimestamp() {
    return timestamp;
  }


}
