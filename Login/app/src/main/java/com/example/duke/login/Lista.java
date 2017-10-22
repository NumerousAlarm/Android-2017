package com.example.duke.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Lista extends AppCompatActivity {
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        lista = (ListView) findViewById(R.id.lista);

        String[] companeros={"Leer Placa","Vehiculos Afiliados","Acerca de","Cerrar Sesion"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(lista.getContext(),android.R.layout.simple_list_item_1,companeros);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

                String selectedFromList =(String) (lista.getItemAtPosition(myItemInt));

                switch (selectedFromList){
                    case "Leer Placa":
                        Intent intent = new Intent(getBaseContext(), QR.class);
                        startActivity(intent);
                        finish();
                        break;
                    case "Vehiculos Afiliados":
                        Intent i = new Intent(getBaseContext(), principal.class);
                        startActivity(i);
                        finish();
                        break;
                    case "Acerca de":
                        createLayerDialogo();
                        break;
                    case "Cerrar Sesion":
                        createExitDialog();
                        break;
                    default:
                        break;

                }
            }
        });
    }
    public void createExitDialog() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
        builder.setTitle("")
                .setMessage("TERMINAR SESIÓN")
                .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent I = new Intent(Lista.this, Login.class);
                        startActivity(I);
                    }
                })
                .setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.show();
    }

    public void createLayerDialogo() {
        final android.app.AlertDialog builder = new android.app.AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_acerca, null);
        builder.setView(v);

        Button githubLink = (Button)v.findViewById(R.id.perfilLink);
        Button closeDialog = (Button)v.findViewById(R.id.cerrar);

        githubLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.githubLink)));
                startActivity(browserIntent);
            }
        });

        closeDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        builder.dismiss();
                    }
                }
        );
        builder.show();
    }
    }

