public class BakingState implements OrderState {
    @Override
    public void proceed(OrderContext context) {
        try {
            System.out.println("Order is baking...");
            Thread.sleep(1500);
            context.setState(new CuttingState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getStatus() {
        return "Baking";
    }
}