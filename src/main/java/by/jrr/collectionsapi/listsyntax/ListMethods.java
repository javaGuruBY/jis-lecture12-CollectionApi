package by.jrr.collectionsapi.listsyntax;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public void listMethodsList() {
        List<Object> myList = new ArrayList<>();
        myList.get(0);
        myList.set(2, new Object());
        myList.add(new Object());
        myList.add(2, new Object());
        myList.addAll(new ArrayList<>());
        myList.remove(0);
        myList.removeAll(new ArrayList<>());
        myList.retainAll(new ArrayList<>());
        myList.clear();
        myList.size();
        myList.forEach(System.out::println);
    }

    public void listMethodsList2() {
        List<Object> myList = new ArrayList<>();
        myList.isEmpty();
        myList.contains(new Object());
        myList.containsAll(new ArrayList<>());
        myList.subList(1, 4);
        myList.indexOf(new Object());
        myList.toArray();
        myList.toArray(new Object[0]);
    }
}
