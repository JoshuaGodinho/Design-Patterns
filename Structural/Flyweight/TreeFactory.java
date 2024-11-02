import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        //need to add the tree type to the hashmap if it is a new tree type 
		//or retrieve it from the hashmap if it already exists
		//then send that tree type out to be shared amongs all the trees that will be built.
		TreeType treeType = treeTypes.get(name);
		if (treeType == null) {
		    treeType = new TreeType(name, color, otherTreeData);
		    treeTypes.put(name, treeType);
		}
		return treeType;
    }
}