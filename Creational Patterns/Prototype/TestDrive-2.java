public class TestDrive {

	public static void main(String[] args) {
		//PizzaFactory pizzaFactory = new PizzaFactory();
		Restaurant restaurant = new Restaurant();


		Pizza pizza = restaurant.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		Hamburger hamburger = restaurant.orderHamburger("cheese");
		System.out.println("We ordered a " + hamburger.getName() + "\n");

		Sandwich sandwich = restaurant.orderSandwich("cheese");
		System.out.println("We ordered a " + sandwich.getName() + "\n");

		Cloneable smallPlate = PrototypeFactory.getClone("smallPlate");
        Cloneable redNapkin = PrototypeFactory.getClone("redNapkin");
        Cloneable tallCup = PrototypeFactory.getClone("tallCup");

        System.out.println(smallPlate);
        System.out.println(redNapkin);
        System.out.println(tallCup);

        Cloneable smallPlate2 = PrototypeFactory.getClone("smallPlate");
        Cloneable redNapkin2 = PrototypeFactory.getClone("redNapkin");
        Cloneable tallCup2 = PrototypeFactory.getClone("tallCup");

        System.out.println("\nSecond set of clones:");
        System.out.println(smallPlate2);
        System.out.println(redNapkin2);
        System.out.println(tallCup2);


	}
}
