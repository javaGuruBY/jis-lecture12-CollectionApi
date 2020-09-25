package by.jrr.collectionsapi.listsyntax;

import by.jrr.collectionsapi.App;
import by.jrr.collectionsapi.mapex.Person;
import by.jrr.collectionsapi.mapex.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

import static by.jrr.collectionsapi.App.log;
import static org.junit.Assert.*;

public class ListMethodsTest {

    @Test
    public void basicSyntax() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);

        log.info("{}", list);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void basicSyntax_Unmodifiable() {
        List<Integer> list = List.of();
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);

        log.info("{}", list);
    }



    @Test
    public void convert() {
        List<Object> list =Arrays.asList("a", "b");
        String[] result = list.toArray(new String[0]);
    }

    @Test
    public void listHoldsReferences_Immutable() {
        List<Integer> list = new ArrayList<>();
        Integer one = new Integer(1);
        Integer two = new Integer(2);
        Integer three = new Integer(3);

        list.addAll(Arrays.asList(one, two, three));

        two = 5; // new Object created.

        List<Integer> expected = Arrays.asList(1, 2, 3);

        assertEquals(expected, list);
    }

    @Test
    public void listHoldsReferences_Mutable() {
        List<Person> list = new ArrayList<>();
        Person one = new Person("one", "boxMax");
        Person two = new Person("two", "boxMax");
        Person three = new Person("three", "boxMax");

        list.addAll(Arrays.asList(one, two, three));

        two.setName("five");

        List<Person> expected = Arrays.asList(
                new Person("one", "boxMax"),
                new Person("five", "boxMax"),
                new Person("three", "boxMax")
        );

        assertEquals(expected, list);
    }

    @Test
    public void sublistTest() {
        List<String> initialList = new ArrayList<>();
        initialList.addAll(Arrays.asList("a", "b", "c", "d", "e"));

        List<String> sublist = initialList.subList(1, 3);

        log.info("{}", sublist);

        sublist.add("x");
        log.info("{}", initialList);

        initialList.add(1, "z");
//        log.info("{}", sublist); // throws exception
    }

    @Test(expected = UnsupportedOperationException.class)
    public void basicSyntax_Unmodifiable2() {
        List<String> list = List.of("ex", "ze");
        list.add("xs");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void basicSyntax_Unmodifiable3() {
        List<String> list = List.of("ex", "ze");
        list.set(0, "xs");
    }

    @Test
    public void basicSyntax_Unmodifiable4() {
        List<Person> list = List.of(
                new Person("one", "boxMax"),
                new Person("five", "boxMax"),
                new Person("three", "boxMax")
        );

        Person expected = new Person("New Name", "boxMax");

        list.get(0).setName("New Name");

        assertEquals(expected, list.get(0));
    }

    @Test
    public void sublistTestWithCopyOf() {
        List<String> initialList = new ArrayList<>();
        initialList.addAll(Arrays.asList("a", "b", "c", "d", "e"));

        List<String> sublist = initialList.subList(1, 3);

        log.info("{}", sublist);

        sublist.add("x");
        log.info("{}", initialList);

        List<String> copyOfSublist = List.copyOf(sublist);
        initialList.add(1, "z");
        log.info("{}", copyOfSublist);
    }
}
