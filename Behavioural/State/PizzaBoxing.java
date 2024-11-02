public class PizzaBoxing implements State {
    @Override
    public void displayStatus() {
        System.out.println("Pizza is being boxed.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PizzaReady());
    }
}