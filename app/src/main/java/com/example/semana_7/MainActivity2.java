package com.example.semana_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Respuesta = findViewById(R.id.nombref);

        Intent intent =getIntent();

        String nombref = intent.getExtras().getString("Nombrefoto");
        Respuesta.setText(nombref);

    }
}