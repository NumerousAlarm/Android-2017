package com.example.duke.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int precio = 40;
        int cantidad = 3;
        int resultado=precio*cantidad;
        if (resultado>80){
            Toast toast = Toast.makeText(getApplicationContext(),"Soda gratis perro",Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(getApplicationContext(), "No tienes soda gratis carnal",Toast.LENGTH_LONG);
            toast.show();
        }

    }

}
