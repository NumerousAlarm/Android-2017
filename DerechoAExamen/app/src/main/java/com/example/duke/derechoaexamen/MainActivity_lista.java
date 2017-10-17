package com.example.duke.derechoaexamen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity_lista extends Activity {
    private ListView lista;

    public  void regresar (View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity_lista.class);
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista);


        lista = (ListView) findViewById(R.id.lista);

        String[] companeros = {"QR", "Intents", "Dialogos", "GridView","Cerrar"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(lista.getContext(), android.R.layout.simple_list_item_1, companeros);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

                String selectedFromList = (String) (lista.getItemAtPosition(myItemInt));

                switch (selectedFromList) {
                    case "QR":
                        Intent intent = new Intent(getBaseContext(), QR.class);
                        startActivity(intent);
                        break;
                    case "Intents":
                        Intent intent2 = new Intent(getBaseContext(), Intents.class);
                        startActivity(intent2);
                        break;
                    case "Dialogos":
                        Intent intent3 = new Intent(getBaseContext(), Dialogs.class);
                        startActivity(intent3);
                        break;
                    case "Gridview":
                        Intent intent4 = new Intent(getBaseContext(), ActividadPrincipal.class);
                        startActivity(intent4);
                        break;
                    case "Cerrar":
                        Intent intent5 = new Intent(getBaseContext(), Cerrar.class);
                        startActivity(intent5);
                        break;
                }
            }
        });
    }
}
