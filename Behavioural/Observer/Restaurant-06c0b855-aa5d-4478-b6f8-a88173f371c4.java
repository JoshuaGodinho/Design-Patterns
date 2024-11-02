import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant implements Kitchen{

/*
    private FoodFactory factory;

    public Restaurant(FoodFactory factory) {

        this.factory = factory;
    }
*/

    private Map<Integer, WaitStaff> tableWaitStaff = new HashMap<>();
    private Map<Integer, String> tableOrderStatus = new HashMap<>();

    @Override
    public void registerWaitStaff(WaitStaff observer, int table) {
        tableWaitStaff.put(table,observer);
    }

    @Override
    public void removeWaitStaff(WaitStaff observer, int table) {
        tableWaitStaff.remove(table);
    }

    @Override
    public void notifyWaitStaff(int table) {
         WaitStaff observer = tableWaitStaff.get(table);
        if (observer != null) {
            String orderStatus = tableOrderStatus.get(table);
            observer.update(orderStatus);
        }
    }

    @Override
    public String getOrderStatus(int tableNumber) {
        return tableOrderStatus.getOrDefault(tableNumber, "No orders placed yet");
    }

    @Override
    public void setOrderStatus(int tableNumber, String status) {
        tableOrderStatus.put(tableNumber, status);
        System.out.println("Order status: In progress " + status);
    }


    public void processOrders(int table, List<String> orders) {
        for (String order : orders) {
            if (order.contains("pizza")) {
                String type = order.split(" ")[1];
                Pizza pizza = orderPizza(type);
                if(pizza!=null){
                    setOrderStatus(table, pizza.getName());
                    notifyWaitStaff(table);
                }
            } else if (order.contains("hamburger")) {
                Hamburger hamburger = orderHamburger("plain");
                if (hamburger != null) {
                    setOrderStatus(table, hamburger.getName());
                    notifyWaitStaff(table);
                }            }
        }
    }

    public Pizza orderPizza(String type) {
        FoodFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Pizza type not available");
        }
        return pizza;
    }

    public Hamburger orderHamburger(String type) {
        FoodFactory hamburgerFactory = new HamburgerFactory();
        Hamburger hamburger = hamburgerFactory.createHamburger(type);
        if (hamburger != null) {
            hamburger.prepare();
            hamburger.cook();
            hamburger.wrap();
        } else {
            System.out.println("Hamburger type not available");
        }
        return hamburger;
    }

    public Sandwich orderSandwich(String type) {
        FoodFactory sandwichFactory = new SandwichFactory();
        Sandwich sandwich = sandwichFactory.createSandwich(type);
        if (sandwich != null) {
            sandwich.prepare();
            sandwich.cook();
            sandwich.wrap();
        } else {
            System.out.println("Sandwich type not available");
        }
        return sandwich;
    }


}
