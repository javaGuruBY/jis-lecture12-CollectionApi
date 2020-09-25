package by.jrr.collectionsapi.listsyntax;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListMethodsTest {

    @Test
    public void removeMethod() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("three", "two", "one"));

        String removed = list.remove(0);
        assertEquals("three", removed);

        boolean result = list.remove("two");
        assertTrue(result);
    }

    @Test
    public void removeMethod_Integers() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 2, 1));

        Integer removed = list.remove(0);
        assertEquals((Integer) 3, removed);

        boolean result = list.remove(new Integer(2));
        assertTrue(result);
    }

    @Test
    public void removeNulls() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 2, 1, null, null, 5, null, 8));

        while (list.remove(null));

        for (Integer i : list) {
            System.out.println(i.toString());
        }
    }
}
