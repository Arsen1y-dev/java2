package lab1.num2;

class Americano extends Coffee {
    public Americano() {
        description = "Американо";
    }

    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public int getCalories() {
        return 4;
    }
}
