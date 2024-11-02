public class PhilipsLight  extends SmartDevice{

    public PhilipsLight(){
        this.name="Philips Light";
    }

    @Override
    public void operate() {
        System.out.println(name + " is now ON.");
    }
}
