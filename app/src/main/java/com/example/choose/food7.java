package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food7 extends Activity {
    Button btnlink7;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food7);
        setTitle("배고프면 눌러봐!");
        btnlink7 = (Button) findViewById(R.id.btnlink7);
        btnlink7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JF7zFEe9Kik"));
                startActivity(intent);
            }
        });
    }
}

