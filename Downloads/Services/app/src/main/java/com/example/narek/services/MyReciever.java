package com.example.narek.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

class MyReciever extends BroadcastReceiver {

    public static final String ACTION_CUSTOM_MESSAGE = "com.example.narek.seevices.CUSTOM_MESSAGE_ACTION";

    @Override
    public void onReceive(Context context, Intent intent) {


        switch (intent.getAction()) {
            case ACTION_CUSTOM_MESSAGE:
                Toast.makeText(context,"ACTION RECIEVED"+intent.getAction(),Toast.LENGTH_SHORT).show();
                break;
        }
    }

}