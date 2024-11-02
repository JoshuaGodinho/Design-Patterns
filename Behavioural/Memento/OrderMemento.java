public class OrderMemento {
    private final OrderState state;

    public OrderMemento(OrderState state) {
        this.state = state;
    }

    public OrderState getSavedState() {
        return state;
    }
}