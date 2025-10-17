
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> map, String text) {
        for (String key : map.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> map, String text) {
        for (String key:map.keySet()){
            if (key.contains(text)){
                System.out.println(map.get(key));
            }
        }

    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");
        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

}
