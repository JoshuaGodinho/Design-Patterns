public interface HomeTheaterDevice {
    void accept(DeviceVisitor visitor);
    double getTemperature();
    double getSignal();
}
