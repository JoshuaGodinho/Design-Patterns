import java.util.List;

public class Restaurant {

/*
    private FoodFactory factory;

    public Restaurant(FoodFactory factory) {

        this.factory = factory;
    }
*/
    public void processOrders(List<String> orders) {
        for (String order : orders) {
            if (order.contains("pizza")) {
                String type = order.split(" ")[1];
                Pizza pizza = orderPizza(type);
                System.out.println("Prepared " + pizza.getName());
            } else if (order.contains("hamburger")) {
                Hamburger hamburger = orderHamburger("plain");
                System.out.println("Prepared " + hamburger.getName());
            }
        }
    }

    public Pizza orderPizza(String type) {
        FoodFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Pizza type not available");
        }
        return pizza;
    }

    public Hamburger orderHamburger(String type) {
        FoodFactory hamburgerFactory = new HamburgerFactory();
        Hamburger hamburger = hamburgerFactory.createHamburger(type);
        if (hamburger != null) {
            hamburger.prepare();
            hamburger.cook();
            hamburger.wrap();
        } else {
            System.out.println("Hamburger type not available");
        }
        return hamburger;
    }

    public Sandwich orderSandwich(String type) {
        FoodFactory sandwichFactory = new SandwichFactory();
        Sandwich sandwich = sandwichFactory.createSandwich(type);
        if (sandwich != null) {
            sandwich.prepare();
            sandwich.cook();
            sandwich.wrap();
        } else {
            System.out.println("Sandwich type not available");
        }
        return sandwich;
    }
}
