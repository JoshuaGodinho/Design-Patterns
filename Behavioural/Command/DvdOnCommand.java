public class DvdOnCommand implements Command{
    DvdPlayer dvdPlayer;

    public DvdOnCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute() {
        DvdPlayer.on();
    }
}
