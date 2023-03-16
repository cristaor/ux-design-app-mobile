package com.misw2023.allwaysoclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ParametrosAlarma extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros_alarma);
    }
    public void irAtras(View view) {
        this.finish();
    }
    public void irAInicio(View view) {
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void irANotificaciones(View view) {
        intent = new Intent(this, Notificaciones.class);
        startActivity(intent);
    }
    public void irASonidos(View view) {
        intent = new Intent(this, Tonos.class);
        startActivity(intent);
    }
    public void irADetencion(View view) {
        intent = new Intent(this, Detencion.class);
        startActivity(intent);
    }
    public void irARepeticion(View view) {
        intent = new Intent(this, Repeticion.class);
        startActivity(intent);
    }

}