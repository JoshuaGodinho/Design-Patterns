public class CuttingState implements OrderState {
    @Override
    public void proceed(OrderContext context) {
        try {
            System.out.println("Order is being cut...");
            Thread.sleep(800);
            context.setState(new BoxingState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getStatus() {
        return "Cutting";
    }
}