package lab1.num2;

class Espresso extends Coffee {
    public Espresso() {
        description = "Эспрессо";
    }

    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public int getCalories() {
        return 5;
    }
}
