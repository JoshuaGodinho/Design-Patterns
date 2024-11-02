public class WaitingState implements OrderState {
    @Override
    public void proceed(OrderContext context) {
        try {
            System.out.println("Order is waiting...");
            Thread.sleep(500);
            context.setState(new AssemblingState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getStatus() {
        return "Waiting";
    }
}