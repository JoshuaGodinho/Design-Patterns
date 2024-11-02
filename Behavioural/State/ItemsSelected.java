public class ItemsSelected implements State{

    @Override
    public void displayStatus() {
        System.out.println("Items selected. Please enter payment information.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PaymentInfoEntered());
    }
}
