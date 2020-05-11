package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.birthday.App.CHANNEL_ID;

public class game extends AppCompatActivity {

    private NotificationManagerCompat notificationManagerCompat;

    private static final int uniqueID=12345;

    private Button check,hint1,hint2,hint3;
    private TextView guess,mrunal,isa,loser,right;
    private EditText brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        notificationManagerCompat=  NotificationManagerCompat.from(this);


        check=(Button)findViewById(R.id.check);
        hint1=(Button)findViewById(R.id.hint1);
        hint2=(Button)findViewById(R.id.hint2);
        hint3=(Button)findViewById(R.id.hint3);
        guess=(TextView)findViewById(R.id.tv_info);
        right=(TextView)findViewById(R.id.tv_guess);
        mrunal=(TextView)findViewById(R.id.mrunal);
        isa=(TextView)findViewById(R.id.isa);
        loser=(TextView)findViewById(R.id.loser);
        brand=(EditText)findViewById(R.id.et_guess);




    }

    public void guessgame(View view) {
        String guess=brand.getText().toString();

        if(guess.equals("fossil")||guess.equals("FOSSIL")||guess.equals("Fossil"))
        {
          right.setText("WAAH!");
            view=this.getWindow().getDecorView();
            view.setBackgroundResource(R.color.Yellow);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(game.this,last.class));
                    finish();
                }
            },1000);
        }
        else
        {
            right.setText("NAH!");
        }
    }


    public void notify2(View view) {
        isa.setText("IS A");
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_message)
                .setContentTitle("HINT 2")
                .setContentText("ROSS STUDIED THEM.")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();


        notificationManagerCompat.notify(1,notification);
    }

    public void notify3(View view) {
        loser.setText("LOSER.");
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_message)
                .setContentTitle("HINT 3")
                .setContentText("ITS FOSSIL YOU DUMBASS.")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();


        notificationManagerCompat.notify(1,notification);
    }



    public void notify1(View view) {
        mrunal.setText("MRUNAL");
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_message)
                .setContentTitle("HINT 1")
                .setContentText("STARTS WITH 'F' AND HAS A 'O' IN IT.")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();


        notificationManagerCompat.notify(1,notification);
    }
}
