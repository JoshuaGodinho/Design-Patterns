public class Restaurant {

    private BuilderFactory builderFactory;
    private OrderCaretaker caretaker;

    public Restaurant() {
        builderFactory = new BuilderFactory();
        caretaker = new OrderCaretaker();
    }

    public Pizza orderPizza(String type) {
        OrderContext orderContext = new OrderContext(new WaitingState());
        PizzaBuilder builder = (PizzaBuilder) builderFactory.getBuilder("pizza");
        if (builder != null) {
            processOrder(orderContext);
            return builder.createPizza(type);
        }
        return null;
    }

    public Hamburger orderHamburger(String type) {
        HamburgerBuilder builder = (HamburgerBuilder) builderFactory.getBuilder("hamburger");
        if (builder != null) {
            return builder.createHamburger(type);
        }
        return null;
    }

    public Sandwich orderSandwich(String type) {
        SandwichBuilder builder = (SandwichBuilder) builderFactory.getBuilder("sandwich");
        if (builder != null) {
            return builder.createSandwich(type);
        }
        return null;
    }

    private void processOrder(OrderContext orderContext) {
    try {
        while (!orderContext.getStatus().equals("Ready for Pickup")) {
            caretaker.saveState(orderContext);
            orderContext.proceed();
            System.out.println("Order is in state: " + orderContext.getStatus());

            if (orderContext.getStatus().equals("Baking")) {
                boolean bakeFailed = Math.random() < 0.3;
                if (bakeFailed) {
                    System.out.println("Baking failed! Reverting to Assembly state...");
                    caretaker.undo(orderContext);
                    continue;
                }
            }

            if (orderContext.getStatus().equals("Cutting")) {
                boolean cuttingFailed = Math.random() < 0.4;
                if (cuttingFailed) {
                    System.out.println("Cutting failed! Reverting to Baking state...");
                    caretaker.undo(orderContext);
                    continue;
                }
            }

            Thread.sleep(500);
        }
        System.out.println("Order is ready for pickup!");
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}


}
