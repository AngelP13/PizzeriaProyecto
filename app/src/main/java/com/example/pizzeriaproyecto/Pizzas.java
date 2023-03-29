package com.example.pizzeriaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pizzas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzas);
    }

    public void OnClick(View view){
        Intent miIntent = new Intent(Pizzas.this,bebidas.class);
        startActivity(miIntent);
    }

}