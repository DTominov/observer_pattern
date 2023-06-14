package com.daniel.interfaces;
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

    float getTemperature();

    float getHumidity();

    float getPressure();
}
