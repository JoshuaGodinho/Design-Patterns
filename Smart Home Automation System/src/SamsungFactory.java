public class SamsungFactory implements DeviceFactory {

    @Override
    public SmartDevice createSmartLight() {
        return new SamsungLight();
    }

    @Override
    public SmartDevice createSmartThermostat() {
        return new SamsungThermostat();
    }
}