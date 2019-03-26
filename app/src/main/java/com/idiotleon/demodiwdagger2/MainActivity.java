package com.idiotleon.demodiwdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.idiotleon.demodiwdagger2.car.Car;
import com.idiotleon.demodiwdagger2.car.Engine;
import com.idiotleon.demodiwdagger2.car.Wheels;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Engine engine = new Engine();
        Wheels wheels = new Wheels();

        Car car = new Car(engine, wheels);
        car.drive();
    }
}
