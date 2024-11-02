public class FoodItemExpression implements Expression {
    private String foodOrder;

    public FoodItemExpression(String foodOrder) {
        this.foodOrder = foodOrder;
    }

    @Override
    public void interpret(OrderContext context) {
        String[] parts = foodOrder.split(" ");

        int quantity = Integer.parseInt(parts[0]);
        String size = parts[1];
        String type = parts[2];
        String foodItem = parts[3];

        context.addOrder(quantity, size, type, foodItem);
    }
}
