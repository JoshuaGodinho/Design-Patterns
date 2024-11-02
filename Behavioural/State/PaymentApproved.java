public class PaymentApproved implements State {
    @Override
    public void displayStatus() {
        System.out.println("Payment approved. Preparing your pizza.");
    }

    @Override
    public void nextState(VendingMachine machine) {
        machine.setState(new PizzaPrepStarted());
    }
}