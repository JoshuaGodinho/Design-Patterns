public class PizzaPrepStarted implements State {
    @Override
    public void displayStatus() {
        System.out.println("Pizza preparation started.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PizzaBaking());
    }
}