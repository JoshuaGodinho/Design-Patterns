public class HamburgerFactory extends FoodFactory {

    @Override
    public Hamburger createHamburger(String type) {
        Hamburger hamburger = null;

        if (type.equals("cheese")) {
            hamburger = new CheeseBurger();
        }

        return hamburger;
    }

}
