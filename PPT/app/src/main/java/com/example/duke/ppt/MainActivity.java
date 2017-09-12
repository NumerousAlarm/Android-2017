package com.example.duke.ppt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ImageView v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button);
        v1=(ImageView)findViewById(R.id.imageView);
        v2=(ImageView)findViewById(R.id.imageView2);
        v3=(ImageView)findViewById(R.id.imageView3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNum = ThreadLocalRandom.current().nextInt(1,3+1);
                if (randomNum ==1){
                    v1.setVisibility(View.VISIBLE);
                    v2.setVisibility(View.INVISIBLE);
                    v3.setVisibility(View.INVISIBLE);
            }else{
                    if (randomNum ==2){
                        v1.setVisibility(View.INVISIBLE);
                        v2.setVisibility(View.VISIBLE);
                        v3.setVisibility(View.INVISIBLE);
                    }else{
                        v1.setVisibility(View.INVISIBLE);
                        v2.setVisibility(View.INVISIBLE);
                        v3.setVisibility(View.VISIBLE);
                    }
                }

        };



        });
    }
}
