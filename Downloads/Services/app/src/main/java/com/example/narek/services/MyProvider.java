package com.example.narek.services;

import java.security.Provider;

/**
 * Created by narek on 7/29/16.
 */
public class MyProvider extends Provider {
    protected MyProvider(String name, double version, String info) {
        super(name, version, info);
    }
}
