package lab1.num2;

class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
        description = "молоко";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    @Override
    public int getCalories() {
        return coffee.getCalories() + 70;
    }
}

