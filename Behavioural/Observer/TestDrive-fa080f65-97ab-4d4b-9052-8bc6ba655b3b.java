public class TestDrive {

	public static void main(String[] args) {
		//PizzaFactory pizzaFactory = new PizzaFactory();
        Restaurant restaurant = new Restaurant();

        ConcreteWaitStaff joshua = new ConcreteWaitStaff("Joshua",1, restaurant);
        ConcreteWaitStaff muskan = new ConcreteWaitStaff("Muskan",2, restaurant);

        joshua.inquireOrderStatus();
        String table1Order = "1 medium cheese pizza";
        OrderContext context1 = new OrderContext();
        OrderExpression orderExpression1 = new OrderExpression(table1Order);
        orderExpression1.interpret(context1);
        restaurant.processOrders(1, context1.getOrders());
        joshua.inquireOrderStatus();

        muskan.inquireOrderStatus();
        String table2Order = "2 large veggie pizzas";
        OrderContext context2 = new OrderContext();
        OrderExpression orderExpression2 = new OrderExpression(table2Order);
        orderExpression2.interpret(context2);
        restaurant.processOrders(2, context2.getOrders());



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
