package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food9 extends Activity {
    Button btnlink9;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food9);
        setTitle("배고프면 눌러봐!");
        btnlink9 = (Button) findViewById(R.id.btnlink9);
        btnlink9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Bk6GniRX86g"));
                startActivity(intent);
            }
        });
    }
}