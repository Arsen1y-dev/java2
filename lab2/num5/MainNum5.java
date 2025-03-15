package lab2;

import lab2.num5.Restaraunt;

public class MainNum5 {
    public static void main(String[] args) {
        Task2_5();
    }

    static void Task2_5() {
        Restaraunt restaraunt = new Restaraunt();

        Thread threadCooker = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                restaraunt.cook("Блюдо " + i);
            }
        });

        Thread threadWaiter = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                restaraunt.serve();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadCooker.start();
        threadWaiter.start();
    }
}