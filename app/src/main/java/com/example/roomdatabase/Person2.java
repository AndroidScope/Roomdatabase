package com.example.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Person2")
public class Person2 {
    @PrimaryKey(autoGenerate =true)
    @SerializedName("id")
    @ColumnInfo(name = "id")
    public int id;

    @SerializedName("user_id")
    @ColumnInfo(name = "user_id")
    public String user_id;






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }


}

