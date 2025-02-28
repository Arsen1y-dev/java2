package lab1.num2;

public class Main {
    public static void main(String[] args) {
        // Базовый кофе
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем размер (medium)
        coffee = new SizeDecorator(coffee, "medium");
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем молоко
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем карамель
        coffee = new Caramel(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем шоколад
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        System.out.println("\n Another Coffee");
        Coffee coffee2 = new Latte();
        coffee2 = new SizeDecorator(coffee2, "large");
        coffee2 = new Chocolate(coffee2);
        System.out.println(coffee2.getDescription() + " | Цена: $" + coffee2.getCost() + " | Калорийность: " + coffee2.getCalories() + " ккал");
    }
}
