package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class idk extends AppCompatActivity {

    private Button dollar,infinte,percentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idk);

        dollar=(Button)findViewById(R.id.button5);
        infinte=(Button)findViewById(R.id.button6);
        percentage=(Button)findViewById(R.id.button7);

    }

    public void dollar(View view) {
        Toast.makeText(getApplicationContext(),"Chup! Paise Tar Nirmit Bharto.",Toast.LENGTH_SHORT).show();
    }


    public void infinity(View view) {
        startActivity(new Intent(idk.this,image.class));
        finish();
    }


    public void percent(View view) {
        Toast.makeText(getApplicationContext(),"NO KT!",Toast.LENGTH_SHORT).show();
    }
}
