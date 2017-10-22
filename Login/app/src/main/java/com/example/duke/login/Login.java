package com.example.duke.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText u, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        u = (EditText) findViewById(R.id.txtUsuario);
        c = (EditText) findViewById(R.id.txtContra);

        Button btn = (Button) findViewById(R.id.btnLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (u.length()>0&&c.length()>0){

                    String usuario = u.getText().toString();
                    String contra = c.getText().toString();

                        if (usuario.equals("segundoparcial")&&contra.equals("1")){
                            Intent intent = new Intent(getApplicationContext(),Lista.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(),"Usuario o contrase;a erroneos.",Toast.LENGTH_LONG).show();
                        }
                    }
                }
            });
            }
        }






