package lab1.num2;

class Latte extends Coffee {
    public Latte() {
        description = "Латте";
    }

    @Override
    public double getCost() {
        return 3.0;
    }

    @Override
    public int getCalories() {
        return 80;
    }
}
