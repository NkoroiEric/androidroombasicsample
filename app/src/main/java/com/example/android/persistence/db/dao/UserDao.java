package com.example.android.persistence.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.example.android.persistence.db.entity.UserEntity;
import java.util.List;

/**
 * Created by nkoroi on 31/05/17.
 */
@Dao
public interface UserDao {
  @Query("SELECT * FROM users") LiveData<List<UserEntity>> loadUsers();


  @Insert(onConflict = OnConflictStrategy.REPLACE) void insertAll(List<UserEntity> users);

  @Query("select * from users where id = :userid") UserEntity loadUserSync(int userid);

}
