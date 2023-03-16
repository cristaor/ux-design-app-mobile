package com.misw2023.allwaysoclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Asistente3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente3);
    }
    public void irAPaso2(View view) {
        Intent intent = new Intent(this, Asistente2.class);
        startActivity(intent);
    }
    public void irAPaso4(View view) {
        Intent intent = new Intent(this, Asistente4.class);
        startActivity(intent);
    }
}