package by.jrr.collectionsapi.mapex;

import java.util.*;

public class DemoMap {

    Map<String, Integer> myMap = new HashMap<>();

    public void mapMethods() {
        myMap.get("key");
        myMap.getOrDefault("not present then return ", 0);
        myMap.put("key", 8);
        myMap.putAll(new TreeMap<>());
        myMap.remove("key");
        myMap.remove("key", 8);
        myMap.clear();
        myMap.size();

        Set<Map.Entry<String, Integer>> entries = myMap.entrySet();
        Set<String> keys = myMap.keySet();
        Collection<Integer> values = myMap.values();
        Iterable<Integer> listValues = myMap.values();
        new ArrayList<>(values);
    }
}
