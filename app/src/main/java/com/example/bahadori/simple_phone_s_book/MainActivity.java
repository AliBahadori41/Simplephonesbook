package com.example.bahadori.simple_phone_s_book;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText fn;
    EditText ln;
    EditText num;
    Button save;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn=findViewById(R.id.editText2);
        ln=findViewById(R.id.editText3);
        num=findViewById(R.id.editText1);
        save=findViewById(R.id.button);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                String firstname = fn.getText().toString();
                String lastname = ln.getText().toString();
                String number = num.getText().toString();



            }
        });

    }
}
