package com.example.pizzeriaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boton_mensaje;
    private static final String CHANNEL_ID = "Canal";
    private PendingIntent pendingIntent;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_mensaje = (Button) findViewById(R.id.btncontinuar);


    }
    public void OnClick(View view){
        Intent miIntent = new Intent(MainActivity.this,Menu.class);
        startActivity(miIntent);
    }

}