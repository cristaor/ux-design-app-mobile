package com.misw2023.allwaysoclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Asistente5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente5);
    }
    public void irAPaso4(View view) {
        Intent intent = new Intent(this, Asistente4.class);
        startActivity(intent);
    }
    public void irAPaso6(View view) {
        Intent intent = new Intent(this, Asistente6.class);
        startActivity(intent);
    }
}