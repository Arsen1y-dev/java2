package lab1.num2;

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
        description = "карамель";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.75;
    }

    @Override
    public int getCalories() {
        return coffee.getCalories() + 60;
    }
}
