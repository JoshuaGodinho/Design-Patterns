//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder=new PizzaOrder(new ThinCrustStrategy());
        pizzaOrder.preparePizza();

        pizzaOrder.setPizzaStrategy(new NormalCrustStrategy());
        pizzaOrder.preparePizza();

        pizzaOrder.setPizzaStrategy(new NullPizzaStrategy());
        pizzaOrder.preparePizza();

        SodaFountain coke = new Coke();
        System.out.println("Serving Coke:");
        coke.dispenseDrink();


        SodaFountain sprite = new Sprite();
        System.out.println("\nServing Sprite:");
        sprite.dispenseDrink();

        SodaFountain water = new Water();
        System.out.println("\nServing Water:");
        water.dispenseDrink();
    }
}