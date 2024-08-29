public class SandwichBuilder extends FoodBuilder {

    @Override
    public Sandwich createSandwich(String type) {
        Sandwich.Builder builder = new Sandwich.Builder();

        if (type.equalsIgnoreCase("cheese")) {
            return builder.setName("Cheese Sandwich")
                          .setBread("Regular Bread")
                          .setFilling("Cheese Filling")
                          .addTopping("Lettuce")
                          .addTopping("Tomato")
                          .addTopping("Pickles")
                          .build();
        } else {
            return null;
        }
    }
}
