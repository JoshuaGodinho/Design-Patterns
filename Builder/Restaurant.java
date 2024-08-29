public class Restaurant {

    public Pizza orderPizza(String type) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.createPizza(type);
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
        HamburgerBuilder hamburgerBuilder = new HamburgerBuilder();
        Hamburger hamburger = hamburgerBuilder.createHamburger(type);
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
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        Sandwich sandwich = sandwichBuilder.createSandwich(type);
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
