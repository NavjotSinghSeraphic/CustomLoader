package com.customloader;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ioslikeloader.CustomLoaderSpinner;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomLoaderSpinner loaderSpinner = (CustomLoaderSpinner) findViewById(R.id.loader);
        loaderSpinner.start();
        Button startBtn = (Button) findViewById(R.id.start);
        Button stopBtn = (Button) findViewById(R.id.stop);

        startBtn.setOnClickListener(v -> {
            loaderSpinner.start();
        });
        stopBtn.setOnClickListener(v -> {
            loaderSpinner.stop();
        });
    }
}