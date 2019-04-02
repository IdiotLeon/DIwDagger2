package com.idiotleon.demodiwdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.idiotleon.demodiwdagger2.car.Car;
import com.idiotleon.demodiwdagger2.car.CarComponent;
import com.idiotleon.demodiwdagger2.car.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
        car.drive();
    }
}
