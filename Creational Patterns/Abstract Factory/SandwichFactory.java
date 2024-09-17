public class SandwichFactory extends FoodFactory {

    @Override
    public Sandwich createSandwich(String type) {
        Sandwich sandwich = null;

        if (type.equals("cheese")) {
            sandwich = new CheeseSandwich();
        }

        return sandwich;
    }

}
