//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            RemoteControl remoteControl=new RemoteControl();

            Amplifier amplifier=new Amplifier("Amplifier");
            AmplifierOnCommand amplifierOnCommand=new AmplifierOnCommand(amplifier);
            AmplifierOffCommand amplifierOffCommand=new AmplifierOffCommand(amplifier);

            DvdPlayer dvdPlayer=new DvdPlayer("DvdPlayer");
            DvdOnCommand dvdOnCommand=new DvdOnCommand(dvdPlayer);
            DvdOffCommand dvdOffCommand=new DvdOffCommand(dvdPlayer);

            remoteControl.setCommand(dvdOnCommand);
            remoteControl.buttonWasPressed();
            remoteControl.setCommand(amplifierOnCommand);
            remoteControl.buttonWasPressed();

            remoteControl.setCommand(dvdOffCommand);
            remoteControl.buttonWasPressed();
            remoteControl.setCommand(amplifierOffCommand);
            remoteControl.buttonWasPressed();



        }
    }


 /*
 Facade Design Pattern
    HomeTheater homeTheater = new HomeTheater();

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();

        Amplifier amp = homeTheater.getAmplifier();
        amp.setVolume(7);

        DvdPlayer dvd = homeTheater.getDvdPlayer();
        dvd.play("The Matrix");

  */