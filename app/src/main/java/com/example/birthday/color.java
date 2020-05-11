package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class color extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


    }

    public void black(View view) {
        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.Black);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(color.this,infinity.class));
                finish();
            }
        },1000);
    }

    public void yellow(View view) {
        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.Yellow);
    }

    public void orange(View view) {
        view=this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.Orange);
    }
}
