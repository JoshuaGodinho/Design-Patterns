public class CheesePizza extends Pizza {
	public CheesePizza() {
		 super(new Pizza.Builder()
            .setName("Cheese Pizza")
            .setDough("Regular Crust")
            .setSauce("Marinara sauce")
            .addTopping("Fresh Mozzarella")
            .addTopping("Parmesan"));
	}
}
