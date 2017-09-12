package com.example.duke.mockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ImageView v1;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                String precio=et1.getText().toString();
                if (precio.equals("")) {
                    Toast.makeText(getApplicationContext(), "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                }else {
                    String precio2=et2.getText().toString();
                    if (precio.equals("")) {
                        Toast.makeText(getApplicationContext(), "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                }
                Toast toast = Toast.makeText(getApplicationContext(), "Ingresando", Toast.LENGTH_LONG);
                toast.show();
        };
    }
    ;})
;};
}
