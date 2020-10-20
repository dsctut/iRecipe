package com.example.irecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, homeActivity.class));
                finish();
            }
        };

        new Handler().postDelayed(run,2000);

    }
}