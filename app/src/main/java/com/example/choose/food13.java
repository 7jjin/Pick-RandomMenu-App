package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food13 extends Activity {
    Button btnlink13;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food13);
        setTitle("배고프면 눌러봐!");
        btnlink13 = (Button) findViewById(R.id.btnlink13);
        btnlink13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0bnFoRQebq0"));
                startActivity(intent);
            }
        });
    }
}
