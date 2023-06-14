package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food10 extends Activity {
    Button btnlink10;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food10);
        setTitle("배고프면 눌러봐!");
        btnlink10 = (Button) findViewById(R.id.btnlink10);
        btnlink10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WneiVYnZgHo"));
                startActivity(intent);
            }
        });
    }
}