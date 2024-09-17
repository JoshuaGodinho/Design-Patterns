import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, Cloneable> prototypes = new HashMap<>();

    static {
        prototypes.put("smallPlate", new PaperPlate("small"));
        prototypes.put("mediumPlate", new PaperPlate("medium"));
        prototypes.put("largePlate", new PaperPlate("large"));
        prototypes.put("redNapkin", new Napkin("red"));
        prototypes.put("whiteNapkin", new Napkin("white"));
        prototypes.put("blueNapkin", new Napkin("blue"));
        prototypes.put("shortCup", new Cup("short"));
        prototypes.put("mediumCup", new Cup("medium"));
        prototypes.put("tallCup", new Cup("tall"));
    }

    public static Cloneable getClone(String type) {
        return prototypes.get(type).clone();
    }
}
