public class TestDrive {

	public static void main(String[] args) {
		//PizzaFactory pizzaFactory = new PizzaFactory();
		Restaurant restaurant = new Restaurant();


		Pizza pizza = restaurant.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		Hamburger hamburger = restaurant.orderHamburger("cheese");
		System.out.println("We ordered a " + hamburger.getName() + "\n");


	}
}
