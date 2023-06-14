package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class food1 extends AppCompatActivity {
    Button btnlink1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food1);
        setTitle("배고프면 눌러봐!");

        btnlink1 = (Button) findViewById(R.id.btnlink1);
        btnlink1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=se86vPOL_vs"));
                startActivity(intent);
            }
        });
    }
}