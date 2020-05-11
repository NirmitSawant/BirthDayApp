package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class last extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        final MediaPlayer yaar= MediaPlayer.create(this,R.raw.yaar);

        Button play= (Button)findViewById(R.id.button11);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yaar.start();
            }
        });

    }
}
