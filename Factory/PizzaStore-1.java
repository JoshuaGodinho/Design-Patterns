public class PizzaStore {

    private PizzaFactory factory;

    public PizzaStore() {
        factory = new PizzaFactory();
        //this.factory = factory;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type); // Calls the factory method

        if(pizza!=null){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        }else{
            System.out.println("Pizza is null");
        }

        return pizza;
    }
}
