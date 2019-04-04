package com.idiotleon.demodiwdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.idiotleon.demodiwdagger2.car.Car;
import com.idiotleon.demodiwdagger2.car.dagger.CarComponent;
import com.idiotleon.demodiwdagger2.car.dagger.DaggerCarComponent;
import com.idiotleon.demodiwdagger2.car.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(14)
                .engineCapacity(1400)
                .build();
        component.inject(MainActivity.this);

        car.drive();
    }
}