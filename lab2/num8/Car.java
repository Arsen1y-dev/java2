package lab2.num8;

import lab2.num8.TrafficLight;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public synchronized void pass(TrafficLight trafficLight) {
        System.out.println("Машина " + name + " подъехала к перекрестку.");
        trafficLight.waitForGreen();
        System.out.println("Машина " + name + " проехала перекресток");
    }
}