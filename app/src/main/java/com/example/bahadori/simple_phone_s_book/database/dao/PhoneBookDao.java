package com.example.bahadori.simple_phone_s_book.database.dao;

import com.example.bahadori.simple_phone_s_book.entity.Person;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface PhoneBookDao {

    @Query("SELECT * FROM Person WHERE phoneNumber = :phoneNumber")
    Person getPersonByPhoneNumber(String phoneNumber);

    @Insert
    void addNewPerson(Person... person);

}
