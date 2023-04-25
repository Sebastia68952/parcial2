package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnFibo;
    EditText txtfibonnaci, txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFibo = findViewById(R.id.btnFibo);
        txtfibonnaci = findViewById(R.id.txtCorreoIniciar);

        btnFibo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(txtfibonnaci.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Todos los campos son requeridos", Toast.LENGTH_SHORT).show();
                }
                else{
                    txtresultado.setText(txtfibonnaci.getText().toString());
                }
            }
        });
    }

}

