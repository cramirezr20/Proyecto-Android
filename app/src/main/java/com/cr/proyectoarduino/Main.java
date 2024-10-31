package com.cr.proyectoarduino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btnPersona);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Persona.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnConfig);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Main.this, Configuracion.class);
                startActivity(intent2);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btnOrdenes);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Main.this, Ordenes.class);
                startActivity(intent3);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btnReportes);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Main.this, Reportes.class);
                startActivity(intent4);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btnDetalles);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Main.this, Detalles.class);
                startActivity(intent5);
            }
        });
    }
}
