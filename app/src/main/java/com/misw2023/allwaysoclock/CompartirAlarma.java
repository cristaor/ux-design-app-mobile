package com.misw2023.allwaysoclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CompartirAlarma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir_alarma);
    }
    public void irAtras(View view) {
        this.finish();
    }
}