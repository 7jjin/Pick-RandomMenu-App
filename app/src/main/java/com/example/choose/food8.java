package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food8 extends Activity {
    Button btnlink8;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food8);
        setTitle("배고프면 눌러봐!");
        btnlink8 = (Button) findViewById(R.id.btnlink8);
        btnlink8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=03TP3PunKjw"));
                startActivity(intent);
            }
        });
    }
}
