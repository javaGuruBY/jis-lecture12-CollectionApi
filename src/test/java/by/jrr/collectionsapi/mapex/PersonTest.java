package by.jrr.collectionsapi.mapex;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void equalsTest() {
    }

    @Test
    public void hashCodeTest() {
    }

    @Test
    public void multipleInvocation() {
        var max = new Person("Max", "boxMax");

        int firstIvocation = max.hashCode();
        int secondIvocation = max.hashCode();
        int thirdIvocation = max.hashCode();

        assertTrue(firstIvocation == secondIvocation);
        assertTrue(secondIvocation == thirdIvocation);
    }

    @Test
    public void differentObjects() {
        var max = new Person("Max", "boxMax");
        var vax = new Person("Vax", "grizly");
        var dax = new Person("Dax", "pet");

        int firstIvocation = max.hashCode();
        int secondIvocation = vax.hashCode();
        int thirdIvocation = dax.hashCode();

        assertFalse(firstIvocation == secondIvocation);
        assertFalse(secondIvocation == thirdIvocation);
    }

    @Test
    public void equalsObjects() {
        var max = new Person("Max", "boxMax");
        var vax = new Person("Max", "boxMax");
        var dax = new Person("Max", "boxMax");

        int firstIvocation = max.hashCode();
        int secondIvocation = vax.hashCode();
        int thirdIvocation = dax.hashCode();

        assertTrue(firstIvocation == secondIvocation);
        assertTrue(secondIvocation == thirdIvocation);
    }

    //will fail if class will be added to hash()
    // return Objects.hash(name, login, this.getClass());
    @Test
    public void sameFieldsDifferentTypes() {
        var max = new Person("Max", "boxMax");
        var vax = new Student("Max", "boxMax");

        int firstIvocation = max.hashCode();
        int secondIvocation = vax.hashCode();

        assertTrue(firstIvocation == secondIvocation);
    }

    @Test
    public void hashForEqualsTrue() {
        var max = new Person("Max", "boxMax");
        var vax = new Person("Max", "boxMax");

        assertTrue(max.equals(vax));
        assertEquals(max.hashCode(), vax.hashCode());
    }
}
//    Hash function is a function that produces determined value
//        ▸ For every argument there is unique hash produced
//        ▸ Whenever hash function is invoked with the same argument more
//        than once, the hash value is consistently the same
//        ▸ Equal arguments should return equal hashes
//        ▸ Whenever two different arguments return equal hashes, it is called
//        collision
//        ▸ Hash function is one way: original value cannot be obtained or
//        calculated from hash
//        ▸ If two objects are equal according to the equals() method,
//        then calling the hashcode() method on each of the two
//        objects must produce the same integer result
