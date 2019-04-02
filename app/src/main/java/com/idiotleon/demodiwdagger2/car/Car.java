package com.idiotleon.demodiwdagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = Car.class.getSimpleName();

    // step 2: to inject the Field
    @Inject
    Engine engine;
    private Wheels wheels;

    // step 1: to inject the Constructor
    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    // step 3: to inject the Method
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving");
    }
}