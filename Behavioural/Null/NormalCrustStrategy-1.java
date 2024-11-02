public class NormalCrustStrategy implements PizzaStrategy {

    @Override
    public void prepareDough() {
        System.out.println("Preparing normal crust dough.");
    }

    @Override
    public void addTopping() {
        System.out.println("Adding regular toppings for normal crust pizza.");
    }

    @Override
    public void bakePizza() {
            System.out.println("Baking normal crust pizza at medium temperature");
    }
}