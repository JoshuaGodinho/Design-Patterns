public class AmplifierOffCommand implements Command{
    Amplifier amplifier;

    public AmplifierOffCommand(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void execute() {
        amplifier.off();
    }
}
