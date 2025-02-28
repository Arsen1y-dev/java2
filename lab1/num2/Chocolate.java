package lab1.num2;

class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
        description = "шоколад";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }

    @Override
    public int getCalories() {
        return coffee.getCalories() + 80;
    }
}
