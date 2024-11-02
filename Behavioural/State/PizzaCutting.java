public class PizzaCutting implements State {
    @Override
    public void displayStatus() {
        System.out.println("Pizza is being cut.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PizzaBoxing());
    }
}