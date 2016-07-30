package com.example.narek.services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by narek on 7/25/16.
 */
public class MyService extends Service {


    public static final int sMSG = 1;
    public static final int sCLIENT_CONNECTED = 1;
    private Messenger mMessenger = new Messenger(new IncomingHandler());

    private List<Messenger>mClients=new ArrayList<>();



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("srv", "onBInd");


        return mMessenger.getBinder();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("srv", "Service Stopped");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("srv", "onStartCommand");
        // someTask();
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

    public String getSomething() {
        return "Kjkszpj";
    }

//    public class LocalBinder extends Binder {
//        public MyService getService() {
//            return MyService.this;
//        }
//
//    }


    private class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case sMSG:

                    break;

                case sCLIENT_CONNECTED:
                    mClients.add(msg);
                    break;
                default:
                    super.handleMessage(msg);

            }
        }
    }
}
