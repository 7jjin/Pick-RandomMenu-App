package com.example.choose;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.choose.Third;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getSupportActionBar();
        //ab.hide();
        getSupportActionBar().setIcon(R.drawable.mainicon_small);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView btnorder = (ImageView) findViewById(R.id.btnorder);
        btnorder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity.this, baedal.class);
                startActivity(intent);
            }
        });

        ImageView btnmade = (ImageView) findViewById(R.id.btnmade);
        btnmade.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Third.class);
                startActivity(intent);
            }
        });

    }
}