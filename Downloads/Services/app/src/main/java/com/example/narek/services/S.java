package com.example.narek.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class S extends Service {
    public S() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
