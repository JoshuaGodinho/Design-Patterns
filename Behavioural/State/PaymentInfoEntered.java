public class PaymentInfoEntered implements State {
    @Override
    public void displayStatus() {
        System.out.println("Payment information entered. Waiting for approval.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PaymentApproved());
    }
}