package com.example.narek.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by narek on 7/25/16.
 */
public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("srv", "onBInd");
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("srv", "Service Stopped");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("srv", "onStartCommand");
        someTask();
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onCreate() {


        super.onCreate();
        Log.d("srv", "Service Started");
    }

    public void someTask() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (Integer i = 0; i < 300; i++) {
                    Log.d("eee", String.valueOf(i));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        }).start();

    }
}
