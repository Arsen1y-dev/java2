package lab1.num2;

class SizeDecorator extends CoffeeDecorator {
    private String size;

    public SizeDecorator(Coffee coffee, String size) {
        super(coffee);
        this.size = size.toUpperCase();
        this.description = size.toUpperCase() + " ";
    }

    @Override
    public String getDescription() {
        return description + coffee.getDescription();
    }

    @Override
    public double getCost() {
        switch (size.toUpperCase()) {
            case "SMALL":
                return coffee.getCost() - 0.5;
            case "MEDIUM":
                return coffee.getCost() + 0.5;
            case "LARGE":
                return coffee.getCost() + 1.0;
            default:
                return coffee.getCost();
        }
    }

    @Override
    public int getCalories() {
        switch (size.toUpperCase()) {
            case "SMALL":
                return coffee.getCalories() - 20;
            case "MEDIUM":
                return coffee.getCalories() + 20;
            case "LARGE":
                return coffee.getCalories() + 40;
            default:
                return coffee.getCalories();
        }
    }
}
