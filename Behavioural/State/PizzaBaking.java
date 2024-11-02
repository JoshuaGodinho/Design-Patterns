public class PizzaBaking implements State {
    @Override
    public void displayStatus() {
        System.out.println("Pizza is baking. Please wait.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PizzaCutting());
    }
}