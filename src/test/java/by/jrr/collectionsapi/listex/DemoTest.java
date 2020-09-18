package by.jrr.collectionsapi.listex;

import by.jrr.collectionsapi.App;
import org.junit.Test;

import java.util.*;

import static by.jrr.collectionsapi.App.log;

public class DemoTest {

    @Test
    public void arrayListSyntax() {
        List<String> scaryStories = new ArrayList<>();
        List<String> scaryStories2 = new LinkedList<>();

        listSyntax(scaryStories);
        listSyntax(scaryStories2);
    }

    private void listSyntax(List<String> myStories) {
        myStories.add("Your browser history is public");
        myStories.add("You didn't kill that spider");

        for(int i = 0; i < myStories.size(); i++) {
            log.info("element is: {}", myStories.get(i));
        }

        for (String story : myStories) {
            log.info("element is: {}", story);
        }

    }
}
