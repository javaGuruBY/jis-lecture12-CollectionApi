package by.jrr.collectionsapi.mapex;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static by.jrr.collectionsapi.App.log;
import static org.junit.Assert.*;

public class DemoMapTest {

    @Test
    public void putSyntax() {
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("max", new Person("Max", "boxMax"));
        personMap.put("vax", new Person("Vax", "grizly"));
        personMap.put("dax", new Person("Dax", "pet"));

        assertEquals(3, personMap.size());
        assertEquals("grizly", personMap.get("vax").login);

        personMap.put("vax", new Person("Vax", "hero"));
        assertEquals(3, personMap.size());
        assertEquals("hero", personMap.get("vax").login);

        personMap.put(null, new Person("Null", "looser"));
        assertEquals(4, personMap.size());
        assertEquals("looser", personMap.get(null).login);
    }

    @Test(expected = NullPointerException.class)
    public void getSyntax() {
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("max", new Person("Max", "boxMax"));
        personMap.put("vax", new Person("Vax", "grizly"));
        personMap.put("dax", new Person("Dax", "pet"));

        Person result = personMap.get("boxMax");
        if(result != null){
            log.info("element found: ");
            assertEquals("looser", personMap.get("boxMax").login);
        }

        assertEquals(null, personMap.get("boxMax"));
        assertEquals("looser", personMap.get("boxMax").login);
    }

    @Test
    public void iteration() {
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("max", new Person("Max", "boxMax"));
        personMap.put("vax", new Person("Vax", "grizly"));
        personMap.put("dax", new Person("Dax", "pet"));

        for (Map.Entry<String, Person> personEntry : personMap.entrySet()) {
            log.info("element: {}", personEntry.getValue());
        }
    }
}
