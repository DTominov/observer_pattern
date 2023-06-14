package com.daniel.java;

import com.daniel.interfaces.Observer;
import com.daniel.interfaces.Subject;

public class Observer1 implements Observer {
    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public Observer1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update() {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        this.pressure = subject.getPressure();
        display();
    }

    public void display(){
        System.out.println("Observer1 reads:");
        System.out.println(
                "Temp: " + temperature + " degrees F" );
        System.out.println(
                "Humidity: " + humidity + " percent" );
        System.out.println(
                "pressure is: " + pressure);
    }
}
