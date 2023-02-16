package com.example.a3_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText name, reg, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.nameRec);
        reg  = findViewById(R.id.redRec);
        phone = findViewById(R.id.phone_nu);

//        Intent j = getIntent();
//        String getName = j.getStringExtra("NAME");
//        String getReg  = j.getStringExtra("REG_NO");

        Bundle data = getIntent().getExtras();
        String colName = data.getString("NAME");
        String colReg = data.getString("REG_NO");
        String colPhone = data.getString("PHONE");


        name.setText(colName);
        reg.setText(colReg);
        phone.setText(colPhone);

    }
}