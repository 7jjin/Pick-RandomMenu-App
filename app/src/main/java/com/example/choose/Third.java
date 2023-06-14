package com.example.choose;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.choose.MainActivity;
import com.example.choose.R;
import com.example.choose.baedal;
import com.example.choose.food1;
import com.example.choose.food10;
import com.example.choose.food11;
import com.example.choose.food12;
import com.example.choose.food13;
import com.example.choose.food14;
import com.example.choose.food15;
import com.example.choose.food16;
import com.example.choose.food17;
import com.example.choose.food18;
import com.example.choose.food19;
import com.example.choose.food2;
import com.example.choose.food20;
import com.example.choose.food3;
import com.example.choose.food4;
import com.example.choose.food5;
import com.example.choose.food6;
import com.example.choose.food7;
import com.example.choose.food8;
import com.example.choose.food9;

import java.util.ArrayList;
import java.util.Collections;

public class Third extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        ImageView yesgogi = (ImageView) findViewById(R.id.yesgogi);
        yesgogi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int min = 1;
                int max = 10;
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = min; i <= max; i++) list.add(i);
                Collections.shuffle(list);

                int x = (int) (Math.random() * 10 + 1);


                switch (x) {
                    case 1:
                        startActivity(new Intent(Third.this, food1.class));
                        break;
                    case 2:
                        startActivity(new Intent(Third.this, food2.class));
                        break;
                    case 3:
                        startActivity(new Intent(Third.this, food3.class));
                        break;
                    case 4:
                        startActivity(new Intent(Third.this, food4.class));
                        break;
                    case 5:
                        startActivity(new Intent(Third.this, food5.class));
                        break;
                    case 6:
                        startActivity(new Intent(Third.this, food6.class));
                        break;
                    case 7:
                        startActivity(new Intent(Third.this, food7.class));
                        break;
                    case 8:
                        startActivity(new Intent(Third.this, food8.class));
                        break;
                    case 9:
                        startActivity(new Intent(Third.this, food9.class));
                        break;
                    case 10:
                        startActivity(new Intent(Third.this, food10.class));
                        break;
                }
            };
        });


        ImageView nogogi = (ImageView) findViewById(R.id.nogogi);
        nogogi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                int min = 1;
                int max = 10;
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = min; i <= max; i++) list.add(i);
                Collections.shuffle(list);

                int x = (int) (Math.random() * 10 + 1);


                switch (x) {
                    case 1:
                        startActivity(new Intent(Third.this, food11.class));
                        break;
                    case 2:
                        startActivity(new Intent(Third.this, food12.class));
                        break;
                    case 3:
                        startActivity(new Intent(Third.this, food13.class));
                        break;
                    case 4:
                        startActivity(new Intent(Third.this, food14.class));
                        break;
                    case 5:
                        startActivity(new Intent(Third.this, food15.class));
                        break;
                    case 6:
                        startActivity(new Intent(Third.this, food16.class));
                        break;
                    case 7:
                        startActivity(new Intent(Third.this, food17.class));
                        break;
                    case 8:
                        startActivity(new Intent(Third.this, food18.class));
                        break;
                    case 9:
                        startActivity(new Intent(Third.this, food19.class));
                        break;
                    case 10:
                        startActivity(new Intent(Third.this, food20.class));
                        break;}
            }
        });

    }
}
