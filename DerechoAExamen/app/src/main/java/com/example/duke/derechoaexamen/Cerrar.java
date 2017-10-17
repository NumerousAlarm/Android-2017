package com.example.duke.derechoaexamen;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class Cerrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerrar);
    }
    public void  cerrar (View v){
        dialogCerrar();
    }
    public void DialogImagen() {
        final AlertDialog builder = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        builder.show();
    }
    public void dialogCerrar() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cerrar applicacion")
                .setMessage("Seguro que desea cerrar la aplicacion?.")
                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.show();
    }
}
