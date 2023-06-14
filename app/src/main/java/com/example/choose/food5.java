package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food5 extends Activity {
    Button btnlink5;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food5);
        setTitle("배고프면 눌러봐!");
        btnlink5 = (Button) findViewById(R.id.btnlink5);
        btnlink5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=o3aLEbn2n5Y"));
                startActivity(intent);
            }
        });
    }
}
