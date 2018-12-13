package com.example.bahadori.simple_phone_s_book;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bahadori.simple_phone_s_book.database.AppDatabase;
import com.example.bahadori.simple_phone_s_book.database.dao.PhoneBookDao;
import com.example.bahadori.simple_phone_s_book.entity.Person;

import androidx.appcompat.app.AppCompatActivity;

public class namayesh_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namayesh__layout);

        final PhoneBookDao phoneBookDao = AppDatabase.with(this).phoneBookDao();

        final EditText phoneNumberInput = findViewById(R.id.phoneNumberEditText);
        final TextView firstNameOutput =findViewById(R.id.firstNameTextView);
        final TextView lastNameOutput = findViewById(R.id.lastNameTextView);
        Button findPersonButton =findViewById(R.id.findPersonButton);

        findPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phoneNumber = phoneNumberInput.getText().toString();

                Person person = phoneBookDao.getPersonByPhoneNumber(phoneNumber);

                firstNameOutput.setText(person.getFirstName());
                lastNameOutput.setText(person.getLastName());
            }
        });


    }
}
