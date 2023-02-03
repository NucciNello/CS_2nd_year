package com.example.a3_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, reg;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        reg  = findViewById(R.id.regist);
        btn  = findViewById(R.id.subm);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName = name.getText().toString();
                String getReg  = reg.getText().toString();

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("NAME", getName);
                i.putExtra("REG_NO", getReg);
                startActivity(i);

            }
        });
    }
}