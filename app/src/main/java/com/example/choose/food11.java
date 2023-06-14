package com.example.choose;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food11 extends Activity {
    Button btnlink11;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food11);
        setTitle("배고프면 눌러봐!");
        btnlink11 = (Button) findViewById(R.id.btnlink11);
        btnlink11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=k5ZezBGitVs"));
                startActivity(intent);
            }
        });
    }
}
