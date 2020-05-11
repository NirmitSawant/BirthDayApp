package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class shitty extends AppCompatActivity {
    private Button clk;
    private VideoView videoView;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shitty);
        clk=(Button)findViewById(R.id.button4);
        videoView=(VideoView)findViewById(R.id.videoView);
        mediaController = new MediaController(this);
    }
    public void videoplay(View view) {
        String videopath="android.resource://com.example.birthday/"+R.raw.nss;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

    }
}
