package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numb1, numb2;
    private Button add;
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numb1   = findViewById(R.id.number1);
        numb2   = findViewById(R.id.number2);
        add     = findViewById(R.id.butt);
        results = findViewById(R.id.result);


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int n1 = Integer.parseInt(numb1.getText().toString());
                int n2 = Integer.parseInt(numb2.getText().toString());
                int resul = n1 + n2;
                results.setText(String.valueOf(resul));
            }
        });

    }
}
