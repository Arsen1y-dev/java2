package lab1.num2;

abstract class CoffeeDecorator extends Coffee {
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", " + description;
    }
}
