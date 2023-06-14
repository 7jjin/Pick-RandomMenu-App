package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collections;

public class zipbap extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);


        //getSupportActionBar().setIcon(R.drawable.mainicon_small);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView nogogi = (ImageView) findViewById(R.id.nogogi);
        nogogi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int min = 1;
                int max = 3;
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = min; i <= max; i++) list.add(i);
                Collections.shuffle(list);

                int x = (int) (Math.random() * 3 + 1);


                switch (x) {
                    case 1:
                        startActivity(new Intent(zipbap.this, food1.class));
                        break;
                    case 2:
                        startActivity(new Intent(zipbap.this, food2.class));
                        break;
                    case 3:
                        startActivity(new Intent(zipbap.this, food3.class));
                        break;
                }
            }
        });

    }
}

