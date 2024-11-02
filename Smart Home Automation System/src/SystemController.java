import java.util.ArrayList;
import java.util.List;

public class SystemController{
    private static SystemController instance;
    private List<DeviceComponent> floors = new ArrayList<>();

    private SystemController() {
        System.out.println("System controller Initialised");
    }

    public static synchronized SystemController getInstance() {
        if (instance == null) {
            instance = new SystemController();
        }
        return instance;
    }


    public void addFloor(DeviceComponent floor) {
        floors.add(floor);
        System.out.println("Added floor: " + floor.getName());
    }

    public void operateAll() {
        System.out.println("Operating all devices in the system.");
        for (DeviceComponent floor : floors) {
            floor.operate();
        }
    }
}
