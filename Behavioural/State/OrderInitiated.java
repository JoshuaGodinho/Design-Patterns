public class OrderInitiated implements State{

    @Override
    public void displayStatus() {
        System.out.println("Order initiated. Please select your items.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new ItemsSelected());
    }
}
