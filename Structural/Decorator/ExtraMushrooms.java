public class ExtraMushrooms extends ToppingDecorator {

    public ExtraMushrooms(Pizza newPizza) {
        super(newPizza);
        toppings.add("Mushrooms");
    }
    
}