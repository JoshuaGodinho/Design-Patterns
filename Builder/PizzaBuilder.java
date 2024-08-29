public class PizzaBuilder extends FoodBuilder {

    @Override
    public Pizza createPizza(String type) {
        Pizza.Builder builder = new Pizza.Builder();

        if (type.equalsIgnoreCase("cheese")) {
            return builder.setName("Cheese Pizza")
                          .setDough("Regular Crust")
                          .setSauce("Marinara Pizza Sauce")
                          .addTopping("Fresh Mozzarella")
                          .addTopping("Parmesan")
                          .build();
        } else {
            return null;
        }
    }
}
