package lab2;

import lab2.num4.GasStation;

public class MainNum4 {
    public static void main(String[] args) {
        Task2_4();
    }

    static void Task2_4() {
        GasStation gasStation = new GasStation(2);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                gasStation.Refuel(String.valueOf(finalI) + " машина");
            }).start();
        }
    }
}