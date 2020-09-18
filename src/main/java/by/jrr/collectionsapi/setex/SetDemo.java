package by.jrr.collectionsapi.setex;

import java.util.Set;

public class SetDemo {

    Set<String> guidedCities;

    public SetDemo(Set<String> guidedCities) {
        this.guidedCities = guidedCities;
    }

    public boolean isGuided(String city) {
        return guidedCities.contains(city);


    }
}
