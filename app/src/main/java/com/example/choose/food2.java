package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food2 extends Activity {
    Button btnlink2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food2);
        setTitle("배고프면 눌러봐!");
        btnlink2 = (Button) findViewById(R.id.btnlink2);
        btnlink2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=t4Es8mwdYlE"));
                startActivity(intent);
            }
        });
    }
}