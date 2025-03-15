package lab2;

import lab2.num4.GasStation;
/*
2.4 Задача «Автозаправочная станция» 🚗⛽

📌 Описание:
На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.

🔹 Что нужно реализовать?
✔ Использовать wait() и notify() для ожидания и освобождения заправки.
✔ Поток "Машина" ждет, если все колонки заняты.
✔ Поток "Машина" заправляется, затем освобождает колонку.
 */
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