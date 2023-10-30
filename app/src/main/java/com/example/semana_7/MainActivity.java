package com.example.semana_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombref;
    Button Botonf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombref = findViewById(R.id.editTextText);
        Botonf = findViewById(R.id.button);

        Botonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                Integer Nombrefoto = Integer.parseInt(nombref.getText().toString();

                intent.putExtra("nombref",Nombrefoto);
                startActivity(intent);

            }

        });


    }
}