import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 1);
        hashMap.put("Anderson", 2);
        hashMap.put("Lewis", 3);
        hashMap.put("Cook", 4);
        hashMap.put("Hung", 5);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 1);
        linkedHashMap.put("Anderson", 2);
        linkedHashMap.put("Lewis", 3);
        linkedHashMap.put("Cook", 4);
        linkedHashMap.put("hung", 5);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
