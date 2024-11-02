public class Amplifier implements HomeTheaterDevice{
    private String name;
    private double temperature;
    private double signalStrength;

    public Amplifier(String name) {
        this.name = name;
        this.temperature = Math.random()*100;
        this.signalStrength = Math.random()*100;
    }


    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public double getSignal() {
        return signalStrength;
    }

    public String getName() {
        return name;
    }

    public static void off() {
		System.out.println("Amplifier off");
	}


    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }
    public interface OverheatListener {
        void onOverheat(Amplifier amplifier);
    }
}
