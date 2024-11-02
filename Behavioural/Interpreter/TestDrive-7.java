public class TestDrive {

	public static void main(String[] args) {
		//PizzaFactory pizzaFactory = new PizzaFactory();

		String customerOrder = "1 medium cheese pizza, 2 large veggie pizzas";

        OrderContext context = new OrderContext();
        OrderExpression orderExpression = new OrderExpression(customerOrder);
        orderExpression.interpret(context);

        Restaurant restaurant = new Restaurant();
        restaurant.processOrders(context.getOrders());


/*		Decorator Pattern

		Restaurant restaurant = new Restaurant();


		Pizza pizza = restaurant.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		pizza = new ExtraCheese(pizza);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		pizza = new ExtraMushrooms(pizza);

		System.out.println("Final Order: " + pizza.getName());
        System.out.println("Toppings: " + String.join(", ", ((ToppingDecorator) pizza).getToppings()));
*/
/*
		Hamburger hamburger = restaurant.orderHamburger("cheese");
		System.out.println("We ordered a " + hamburger.getName() + "\n");

		Sandwich sandwich = restaurant.orderSandwich("cheese");
		System.out.println("We ordered a " + sandwich.getName() + "\n");

 */
	}
}
