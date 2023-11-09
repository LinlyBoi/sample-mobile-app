package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MediaPlayerService extends Service {
    private MediaPlayer player;
    @Override
    public int onStartCommand(Intent intent, int flags, int Startid) {
        player = MediaPlayer.create( this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;


    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}