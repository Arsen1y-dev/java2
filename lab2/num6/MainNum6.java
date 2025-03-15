package lab2;

import lab2.num6.Railway;

public class MainNum6 {
    public static void main(String[] args) {
        Task2_6();
    }

    static void Task2_6() {
        Railway railway = new Railway();

        Thread threadCars = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                railway.passCar(i + " машина");
            }
        });

        Thread threadTrain = new Thread(() -> {
            try {
                Thread.sleep(2000);
                railway.trainIsPassing();
                Thread.sleep(2000);
                railway.trainPassed();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadCars.start();
        threadTrain.start();
    }
}