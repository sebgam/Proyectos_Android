package com.sebas.desarrollog.interfaz_java;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;

    }

    public void incrementarContador(View vista){

        contador++;

    }

    public void restaContador(View vista){
        contador--;
    }

    public void reseteaContador(View vista){
        contador =0;
    }



}
