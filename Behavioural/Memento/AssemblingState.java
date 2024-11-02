public class AssemblingState implements OrderState {
    @Override
    public void proceed(OrderContext context) {
        try {
            System.out.println("Order is being assembled...");
            Thread.sleep(1000);
            context.setState(new BakingState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getStatus() {
        return "Assembling";
    }
}