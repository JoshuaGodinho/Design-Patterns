//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Amplifier amplifier = new Amplifier("Amplifier");

        AmplifierOffCommand amplifierOffCommand = new AmplifierOffCommand(amplifier);

        Amplifier.OverheatListener overheatListener = new Amplifier.OverheatListener() {
            @Override
            public void onOverheat(Amplifier amp) {
                System.out.println("Client received overheat notification for " + amp.getName());
                remoteControl.setCommand(amplifierOffCommand);
                remoteControl.buttonWasPressed();
            }
        };
        ConcreteVisitor diagnosticsVisitor = new ConcreteVisitor();
        diagnosticsVisitor.setOverheatListener(overheatListener);

        amplifier.accept(diagnosticsVisitor);

    }
}