public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(Pizza newPizza) {
        super(newPizza);
        toppings.add("Extra Cheese");
    }

}