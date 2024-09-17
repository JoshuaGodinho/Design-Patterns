public class HamburgerBuilder extends FoodBuilder {

    @Override
    public Hamburger createHamburger(String type) {
        Hamburger.Builder builder = new Hamburger.Builder();

        if (type.equalsIgnoreCase("cheese")) {
            return builder.setName("Cheese Burger")
                          .setBun("Regular Bun")
                          .setPatty("Beef Patty")
                          .addTopping("Cheese")
                          .addTopping("Lettuce")
                          .addTopping("Tomato")
                          .addTopping("Pickles")
                          .build();
        } else {
            return null;
        }
    }
}
