public class BoxingState implements OrderState {
    @Override
    public void proceed(OrderContext context) {
        try {
            System.out.println("Order is being boxed...");
            Thread.sleep(500);
            context.setState(new ReadyState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getStatus() {
        return "Boxing";
    }
}