package com.example.about_me;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class splash_Act extends Activity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        t= (TextView) findViewById(R.id.textView);
        Typeface myCostumFont=Typeface.createFromAsset(getAssets(),"font/Municipal.ttf");

        t.setTypeface(myCostumFont);



        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(2500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(splash_Act.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
