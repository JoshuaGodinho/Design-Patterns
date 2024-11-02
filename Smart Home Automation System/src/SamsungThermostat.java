public class SamsungThermostat extends SmartDevice {
    public SamsungThermostat() {
        this.name = "Samsung Smart Thermostat";
    }

    @Override
    public void operate() {
        System.out.println(name + " is now controlling the temperature.");
    }
}