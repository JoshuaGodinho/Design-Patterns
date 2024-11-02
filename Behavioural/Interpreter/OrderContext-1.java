import java.util.ArrayList;
import java.util.List;

public class OrderContext {
    private List<String> orders = new ArrayList<>();

    public void addOrder(int quantity, String size, String type, String foodItem) {
        for (int i = 0; i < quantity; i++) {
            orders.add(size + " " + type + " " + foodItem);
        }
    }

    public List<String> getOrders() {
        return orders;
    }
}
