public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new WaitingState();  // Default state
    }

    public OrderContext(OrderState state) {
        this.state = state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void proceed() {
        state.proceed(this);
    }

    public String getStatus() {
        return state.getStatus();
    }

    public OrderMemento saveStateToMemento() {
        return new OrderMemento(state);
    }

    public void getStateFromMemento(OrderMemento memento) {
        state = memento.getSavedState();
    }
}
