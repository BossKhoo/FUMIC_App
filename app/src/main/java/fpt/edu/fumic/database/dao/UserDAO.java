package fpt.edu.fumic.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import fpt.edu.fumic.database.entity.UserEntity;

@Dao
public interface UserDAO {
    @Query("SELECT * FROM USER")
    LiveData<List<UserEntity>> getAllUser();

    @Query("SELECT * FROM USER WHERE Id = :username")
    UserEntity getUserById(String username);

    @Insert
    void insertUser(UserEntity user);

    @Update
    void updateUser(UserEntity userEntity);
}