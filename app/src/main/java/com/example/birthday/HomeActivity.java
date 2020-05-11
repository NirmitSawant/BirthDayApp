package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private Button nice,shitty,idk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        nice=(Button)findViewById(R.id.button);
        shitty=(Button)findViewById(R.id.button2);
        idk=(Button)findViewById(R.id.button3);

        nice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DIDN'T EXPECT YOU TO SELECT THIS! OOPS",Toast.LENGTH_SHORT).show();
            }
        });

        shitty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,shitty.class));
            }
        });

        idk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,idk.class));
                finish();
            }
        });
    }
}
