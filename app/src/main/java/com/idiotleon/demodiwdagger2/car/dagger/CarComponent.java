package com.idiotleon.demodiwdagger2.car.dagger;

import com.idiotleon.demodiwdagger2.MainActivity;
import com.idiotleon.demodiwdagger2.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    // For constructor injection
    Car getCar();

    // For field injection
    void inject(MainActivity mainActivity);
}
