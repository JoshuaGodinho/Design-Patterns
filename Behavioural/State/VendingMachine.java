public class VendingMachine {

    private State state;

    public VendingMachine() {
        state=new OrderInitiated();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void displayStatus() {
        state.displayStatus();
    }

    public void nextState() {
        state.nextState(this);
    }
}
