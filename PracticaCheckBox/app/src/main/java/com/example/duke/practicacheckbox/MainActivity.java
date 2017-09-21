package com.example.duke.practicacheckbox;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox recuerdame;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recuerdame = (CheckBox)findViewById(R.id.checkBox);
        password = (EditText)findViewById(R.id.editTextpassword);
        recuerdame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (recuerdame.isChecked() == true){
                        Toast.makeText(getApplicationContext(), "esta marcado", Toast.LENGTH_SHORT).show();
                        password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    }else
                            Toast.makeText(getApplicationContext(), "no esta marcado", Toast.LENGTH_SHORT).show();
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD );
            }
        });
        }
    }

