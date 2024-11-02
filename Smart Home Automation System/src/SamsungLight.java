public class SamsungLight extends SmartDevice {
    public SamsungLight() {
        this.name = "Samsung Smart Light";
    }

    @Override
    public void operate() {
        System.out.println(name + " is now ON.");
    }
}
