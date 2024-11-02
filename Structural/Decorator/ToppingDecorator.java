import java.util.ArrayList;
import java.util.List;

public abstract class ToppingDecorator extends Pizza {
    public Pizza tempPizza;
    protected List<String> toppings = new ArrayList<>();

    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
        this.toppings.addAll(tempPizza instanceof ToppingDecorator ? ((ToppingDecorator) tempPizza).getToppings() : new ArrayList<>());
    }


    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return tempPizza.getName();
    }
}
