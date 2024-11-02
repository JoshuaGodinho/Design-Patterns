public class PizzaReady implements State {
    @Override
    public void displayStatus() {
        System.out.println("Pizza is ready! Please collect your pizza.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        System.out.println("Enjoy your pizza!");
    }
}