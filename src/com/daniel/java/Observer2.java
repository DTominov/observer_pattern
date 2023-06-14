package com.daniel.java;

import com.daniel.interfaces.Observer;
import com.daniel.interfaces.Subject;

public class Observer2 implements Observer {
    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public Observer2(Subject subject){
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
        System.out.println("Observer2 reads:");
        System.out.println(
                "Temp: " + temperature + " degrees F" );
        System.out.println(
                "Humidity: " + humidity + " percent" );
        System.out.println(
                "pressure is: " + pressure);
    }
}
