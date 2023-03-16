package com.misw2023.allwaysoclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Asistente2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente2);
    }
    public void irAPaso1(View view) {
        Intent intent = new Intent(this, Asistente1.class);
        startActivity(intent);
    }
    public void irAPaso3(View view) {
        Intent intent = new Intent(this, Asistente3.class);
        startActivity(intent);
    }
}