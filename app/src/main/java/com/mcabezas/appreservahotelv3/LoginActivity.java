package com.mcabezas.appreservahotelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        asignarRedferencias();
    }

    private void asignarRedferencias(){
        btnIngresar = findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(v -> {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}