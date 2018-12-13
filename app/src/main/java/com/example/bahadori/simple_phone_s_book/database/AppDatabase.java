package com.example.bahadori.simple_phone_s_book.database;

import android.content.Context;

import com.example.bahadori.simple_phone_s_book.database.dao.PhoneBookDao;
import com.example.bahadori.simple_phone_s_book.entity.Person;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Person.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public static AppDatabase with(Context context) {

        if (instance == null)
            instance = Room.databaseBuilder(context, AppDatabase.class, "db").allowMainThreadQueries().build();

        return instance;

    }

    public abstract PhoneBookDao phoneBookDao();

}
