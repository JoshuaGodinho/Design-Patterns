public class AmplifierOnCommand implements Command{
    Amplifier amplifier;

    public AmplifierOnCommand(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void execute() {
        Amplifier.on();
    }
}
