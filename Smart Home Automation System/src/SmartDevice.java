public abstract class SmartDevice implements DeviceComponent,Cloneable{
    protected String name;

    public String getName() {
        return name;
    }

    public abstract void operate();

    @Override
    public void add(DeviceComponent component) {
        throw new UnsupportedOperationException("Cannot add child to a device.");
    }

    @Override
    public void remove(DeviceComponent deviceComponent) {
        throw new UnsupportedOperationException("Cannot remove child from a device.");
    }

    @Override
    public DeviceComponent getChild(int index) {
        throw new UnsupportedOperationException("No child exists for a device.");
    }


    @Override
    public SmartDevice clone(){
        try {
            return (SmartDevice) super.clone();
        }catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for this object");
        }
    }
}
