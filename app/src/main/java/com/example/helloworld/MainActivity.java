package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World as a debug log");
        Log.e("MainActivity", "Hello World as an error log ");
        Log.i("MainActivity", "Hello World as an info log");
        Log.w("MainActivity", "Hello World as a warn log");
    }
}
