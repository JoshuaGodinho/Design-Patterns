import java.util.ArrayList;

abstract public class Sandwich {
    String name;
    String bread;
    String filling;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void cook() {
        System.out.println("Cooking " + name);
    }

    public void wrap() {
        System.out.println("Wrapping " + name);
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(bread + "\n");
        display.append(filling + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
