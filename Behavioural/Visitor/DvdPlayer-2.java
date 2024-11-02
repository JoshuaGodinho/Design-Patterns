public class DvdPlayer implements HomeTheaterDevice {
    private String name;
    private double temperature;
    private double signalStrength;

    public DvdPlayer(String name) {
        this.name = name;
        this.temperature = Math.random() * 100; // Simulate temperature
        this.signalStrength = Math.random() * 100; // Simulate signal strength
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public double getSignal() {
        return 0;
    }


    public String getName() {
        return name;
    }

    public void shutDown() {
        System.out.println("Shutting down " + name);
    }
}
