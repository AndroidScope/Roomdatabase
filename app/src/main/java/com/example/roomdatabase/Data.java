package com.example.roomdatabase;



import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Data {
    @Query("select * from SOPANSWER")
    List<Person> getallarealist();
    @Insert
    void insert(Person model);
}
