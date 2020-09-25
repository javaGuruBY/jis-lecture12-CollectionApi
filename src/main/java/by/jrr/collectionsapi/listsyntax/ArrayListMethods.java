package by.jrr.collectionsapi.listsyntax;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethods {
    List<Object> myList = new ArrayList<>();

    public void arraylistConstructorsList() {

        new ArrayList<>();                  // initial capacity 10
        new ArrayList<>(100);   // initial capacity 100
        new ArrayList<>(new LinkedList<>());

    }

    public void listMethodsList() {
        myList.add(new Object());
        myList.add(0, new Object());
        myList.addAll(new LinkedList<>());
        myList.addAll(6, new LinkedList<>());

        myList.remove(0);
        myList.remove(new Object());

        myList.clear();
        myList.contains(new Integer(0));

        myList.get(0);
        myList.indexOf(new Integer(0));
        myList.lastIndexOf(new Integer(0));

        myList.size();
        myList.isEmpty();
    }
}
