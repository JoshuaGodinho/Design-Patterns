public interface OrderState {
    void proceed(OrderContext context);
    String getStatus();
}
