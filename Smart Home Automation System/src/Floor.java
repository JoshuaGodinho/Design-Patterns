import java.util.List;
import java.util.ArrayList;

public class Floor implements DeviceComponent{

    private String name;
    private List<DeviceComponent> rooms=new ArrayList<>();

    public Floor(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("Operating all rooms on " + name);
        for (DeviceComponent room : rooms) {
            room.operate();
        }
    }

    @Override
    public void add(DeviceComponent component) {
        rooms.add(component);
    }

    @Override
    public void remove(DeviceComponent component) {
        rooms.remove(component);
    }

    @Override
    public DeviceComponent getChild(int index) {
        return rooms.get(index);
    }

    @Override
    public String getName() {
        return name;
    }
}
