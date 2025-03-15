package lab2;

import lab2.num8.Car;
import lab2.num8.TrafficLight;

public class MainNum8 {
    public static void main(String[] args) {
        Task2_8();
    }

    static void Task2_8() {
        TrafficLight trafficLight = new TrafficLight();

        Thread threadTrafficLight = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            while (true) {
                trafficLight.changeColor();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread threadCar = new Thread(() -> {
            for (int i = 1; i <= 12; i++) {
                Car car = new Car(String.valueOf(i));
                car.pass(trafficLight);
                try {
                    Thread.sleep(900);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        threadTrafficLight.start();
        threadCar.start();
    }
}