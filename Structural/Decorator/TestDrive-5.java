public class TestDrive {

	public static void main(String[] args) {
		//PizzaFactory pizzaFactory = new PizzaFactory();
		Restaurant restaurant = new Restaurant();


		Pizza pizza = restaurant.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		pizza = new ExtraCheese(pizza);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		pizza = new ExtraMushrooms(pizza);

		System.out.println("Final Order: " + pizza.getName());
        System.out.println("Toppings: " + String.join(", ", ((ToppingDecorator) pizza).getToppings()));

/*
		Hamburger hamburger = restaurant.orderHamburger("cheese");
		System.out.println("We ordered a " + hamburger.getName() + "\n");

		Sandwich sandwich = restaurant.orderSandwich("cheese");
		System.out.println("We ordered a " + sandwich.getName() + "\n");

 */
	}
}
