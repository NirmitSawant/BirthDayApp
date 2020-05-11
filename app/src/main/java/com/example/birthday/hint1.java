package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hint1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint1);


        TextView textView=findViewById(R.id.textView12);

        String message =getIntent().getStringExtra("message");
        textView.setText(message);
    }
}
