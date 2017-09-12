package com.example.duke.grados;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.editText);
        btn1 = (Button)findViewById(R.id.button);
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double gradosCelsius = Integer.parseInt(et1.getText().toString());

            double gradosFar=(gradosCelsius*1.8);
            if (gradosFar > 100) {
                ((RelativeLayout)findViewById(R.id.l)).setBackgroundColor(Color.parseColor("#f44242"));
                Toast toast = Toast.makeText(getApplicationContext(), "Caliente", Toast.LENGTH_LONG);
                toast.show();
            } else {
                ((RelativeLayout)findViewById(R.id.l)).setBackgroundColor(Color.parseColor("#41f4f4"));
                Toast toast = Toast.makeText(getApplicationContext(), "Frio", Toast.LENGTH_LONG);
                toast.show();
            }

        }
    }
    );
    }
}