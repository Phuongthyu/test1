package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int mark;
        Random r = new Random();
        mark = r.nextInt(100);
        TextView main = findViewById(R.id.textView_Main);
        main.setText("Hello World");
        main.append("\nYour mark is: " + mark);
        if (mark <50)
            main.append("\nSorry you failed");

    }
}