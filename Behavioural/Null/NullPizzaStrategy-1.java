public class NullPizzaStrategy implements PizzaStrategy{

    @Override
    public void prepareDough() {
        System.out.println("Unknown pizza type: No dough preparation needed.");
    }

    @Override
    public void addTopping() {
        System.out.println("Unknown pizza type: No toppings to add.");
    }

    @Override
    public void bakePizza() {
        System.out.println("Unknown pizza type: No baking required.");
    }
}
