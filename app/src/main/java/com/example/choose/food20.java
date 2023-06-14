package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food20 extends Activity {
    Button btnlink20;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food20);
        setTitle("배고프면 눌러봐!");
        btnlink20 = (Button) findViewById(R.id.btnlink20);
        btnlink20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=u8s0XK5WXuw"));
                startActivity(intent);
            }
        });
    }
}
