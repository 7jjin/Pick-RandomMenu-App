package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food14 extends Activity {
    Button btnlink14;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food14);
        setTitle("배고프면 눌러봐!");
        btnlink14 = (Button) findViewById(R.id.btnlink14);
        btnlink14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gX637LsLRy0"));
                startActivity(intent);
            }
        });
    }
}