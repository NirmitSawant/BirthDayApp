package com.example.birthday;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class App extends Application {

    public static final String CHANNEL_ID="channel 1";
    NotificationCompat.Builder notification;

    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannel();


    }

    private void createNotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,"channel_1",
                    NotificationManager.IMPORTANCE_HIGH);
            channel.setDescription("THIS IS CHANNEL 1");
            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
