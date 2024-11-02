import java.util.List;
import java.util.ArrayList;

public class Room implements DeviceComponent{

    private String name;
    private List<DeviceComponent> devices=new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("Operating devices in "+ name);
        for(DeviceComponent device:devices)
            device.operate();
    }

    @Override
    public void add(DeviceComponent component) {
        devices.add(component);
    }

    @Override
    public void remove(DeviceComponent component) {
        devices.remove(component);
    }

    @Override
    public DeviceComponent getChild(int index) {
        return devices.get(index);
    }

    @Override
    public String getName() {
        return name;
    }
}
