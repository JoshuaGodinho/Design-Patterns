public class ReadyState implements OrderState {
    @Override
    public void proceed(OrderContext context) {
    }

    @Override
    public String getStatus() {
        return "Ready for Pickup";
    }
}