public class PhilipsThermostat extends SmartDevice {
    public PhilipsThermostat() {
        this.name = "Philips Smart Thermostat";
    }

    @Override
    public void operate() {
        System.out.println(name + " is now controlling the temperature.");
    }
}