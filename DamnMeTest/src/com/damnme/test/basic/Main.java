package com.damnme.test.basic;


import java.util.Date;

import com.damnme.test.basic.animal.Cat;
/*
import com.damnme.test.basic.vehicle.Car;
import com.damnme.test.basic.vehicle.Motorcycle;
import com.damnme.test.basic.vehicle.Train;
*/
import com.damnme.test.basic.vehicle.*;



public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Damn Me!");
        Cat.sound();
        Car.totalTire();
        Motorcycle.totalTire();
        Train.totalTire();

        Date today = new Date();
        System.out.println("Today is " + today);

        System.exit(0);
    }
}