package lab2;

import lab2.num7.Warehouse;

public class MainNum7 {
    public static void main(String[] args) {
        Task2_7();
    }

    static void Task2_7() {
        Warehouse warehouse = new Warehouse();

        Thread threadManufacturer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                warehouse.addProduct(String.valueOf(i));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadBuyer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                warehouse.buyProduct();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadManufacturer.start();
        threadBuyer.start();
    }
}