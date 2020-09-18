package by.jrr.collectionsapi.setex;

import by.jrr.collectionsapi.mapex.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetDemoTest {

    SetDemo setDemo;

    @Before
    public void setup() {
        setDemo = new SetDemo(Set.of("Rome", "Minsk", "Tula"));
    }

    @Test
    public void isGuided() {

        assertTrue(setDemo.isGuided("Rome"));
        assertFalse(setDemo.isGuided("Brest"));
    }

    @Test
    public void syntax() {
        Set<String> cities = new HashSet<>();

        cities.add("Rome");
        cities.add("Minsk");
        cities.add("Tula");
        cities.add("Rome");

        assertEquals(3, cities.size());

        assertTrue(cities.contains("Minsk"));
        assertFalse(cities.contains("Brest"));
    }

    @Test
    public void syntaxDemo() {
        Set<Person> personSet = Set.of(
                new Person("Max", "boxMax"),
                new Person("Vax", "grizly"),
                new Person("Dax", "pet")
        );

        Person user = new Person("Max", "boxMax");
        assertTrue(personSet.contains(user));

    }
}
