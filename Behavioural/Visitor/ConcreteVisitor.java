public class ConcreteVisitor implements DeviceVisitor{
    private Amplifier.OverheatListener overheatListener;

    public void setOverheatListener(Amplifier.OverheatListener listener) {
        this.overheatListener = listener;
    }

    @Override
    public void visit(Amplifier amp) {
        System.out.println("Checking Amplifier: " + amp.getName());
        if(amp.getTemperature()>10){
            System.out.println("Warning: "+amp.getName()+" is overheating");
            overheatListener.onOverheat(amp);
        }


        if(amp.getSignal()<30)
            System.out.println("Warning: " + amp.getName() + " has low signal strength!");
    }

    @Override
    public void visit(DvdPlayer dvdPlayer) {
        System.out.println("Checking DvdPlayer: " + dvdPlayer.getName());
        if(dvdPlayer.getTemperature()>100)
            System.out.println("Warning: "+dvdPlayer.getName()+" is overheating");

        if(dvdPlayer.getSignal()<40)
            System.out.println("Warning: " + dvdPlayer.getName() + " has low signal strength!");
    }

}
