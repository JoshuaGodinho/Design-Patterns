public class ThinCrustStrategy implements PizzaStrategy{

    @Override
    public void prepareDough() {
        System.out.println("Preparing thin crust dough.");
    }

    @Override
    public void addTopping() {
        System.out.println("Adding light toppings for thin crust pizza.");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking thin crust pizza at high temperature");
    }
}
