package com.example.duke.numeroprimo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText numero;
    Button primo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText) findViewById(R.id.editText);
        primo = (Button) findViewById(R.id.button);
        primo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a = Integer.parseInt(numero.getText().toString());
            if (a%2 == 0){

                    Toast toast = Toast.makeText(getApplicationContext(),"Par",Toast.LENGTH_LONG);
                    toast.show();
            }else {
                Toast toast = Toast.makeText(getApplicationContext(),"Primo",Toast.LENGTH_LONG);
                toast.show();
            }
            }
        });
    }
}
