public class DvdOffCommand implements Command{
    DvdPlayer dvdPlayer;

    public DvdOffCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute() {
        DvdPlayer.off();
    }
}
