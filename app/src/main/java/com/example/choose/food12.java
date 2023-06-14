package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food12 extends Activity {
    Button btnlink12;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food12);
        setTitle("배고프면 눌러봐!");
        btnlink12 = (Button) findViewById(R.id.btnlink12);
        btnlink12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=10fl2mebYHs"));
                startActivity(intent);
            }
        });
    }
}