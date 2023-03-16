package com.misw2023.allwaysoclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void irANuevaAlarma(View view) {
            intent = new Intent(this, NuevaAlarma.class);
            startActivity(intent);
        }

        public void irACompartir(View view) {
        intent = new Intent(this, CompartirAlarma.class);
        startActivity(intent);
        }
        public void irAPaso1(View view) {
            intent = new Intent(this, Asistente1.class);
            startActivity(intent);
        }
}