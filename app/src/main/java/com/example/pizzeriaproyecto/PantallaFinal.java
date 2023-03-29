package com.example.pizzeriaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_final);
    }

    public void OnClick(View view) {

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.regresar:
                miIntent=new Intent(PantallaFinal.this,MainActivity.class);
                break;

            case R.id.salir:
                finish();
                break;

        }
        startActivity(miIntent);
    }

}