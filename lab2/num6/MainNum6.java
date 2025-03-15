package lab2;

import lab2.num6.Railway;
/*
2.6 Задача «Железнодорожный переезд» 🚆🚗

📌 Описание:
Есть автомобили и поезд.

Если поезд приближается, машины останавливаются и ждут.
После того, как поезд проедет, машины продолжают движение.
🔹 Что нужно реализовать?
✔ Поток "Поезд" останавливает автомобили (wait()).
✔ Поток "Поезд" сообщает о завершении (notifyAll()).
✔ Машины ждут, если поезд едет, и продолжают движение после notifyAll().
 */
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