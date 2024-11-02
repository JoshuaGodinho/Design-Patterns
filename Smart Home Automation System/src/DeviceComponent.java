public interface DeviceComponent {
    void operate();
    void add(DeviceComponent component);
    void remove(DeviceComponent component);
    DeviceComponent getChild(int index);
    String getName();
}
