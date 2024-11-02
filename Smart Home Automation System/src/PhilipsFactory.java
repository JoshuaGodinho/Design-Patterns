public class PhilipsFactory implements DeviceFactory {

    @Override
    public SmartDevice createSmartLight() {
        return new PhilipsLight();
    }

    @Override
    public SmartDevice createSmartThermostat() {
        return new PhilipsThermostat();
    }
}