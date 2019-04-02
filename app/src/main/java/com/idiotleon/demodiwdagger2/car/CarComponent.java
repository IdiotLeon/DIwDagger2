package com.idiotleon.demodiwdagger2.car;

import com.idiotleon.demodiwdagger2.MainActivity;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {
    // For constructor injection
    Car getCar();

    // For field injection
    void inject(MainActivity mainActivity);
}
