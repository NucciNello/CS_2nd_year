package com.example.a3_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText name, reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.nameRec);
        reg  = findViewById(R.id.redRec);

        Intent j = getIntent();
        String getName = j.getStringExtra("NAME");
        String getReg  = j.getStringExtra("REG_NO");

        name.setText(getName);
        reg.setText(getReg);

    }
}