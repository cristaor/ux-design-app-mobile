package com.misw2023.allwaysoclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tonos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonos);
    }

    public void irAParametrosAlarma(View view) {
        Intent intent = new Intent(this, ParametrosAlarma.class);
        startActivity(intent);
    }
    public void irAtras(View view) {
        this.finish();
    }
    public void irAMusica(View view) {
        Intent intent = new Intent(this, Musica.class);
        startActivity(intent);
    }
}