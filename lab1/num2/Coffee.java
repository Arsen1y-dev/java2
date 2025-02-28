package lab1.num2;

abstract class Coffee {
    String description = "Простой кофе";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
    public abstract int getCalories();
}
