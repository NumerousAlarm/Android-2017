package com.example.duke.derechoaexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dialogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);
    }
    public  void regresar (View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity_lista.class);
        startActivity(intent);
        finish();
    }
}
