package by.jrr.collectionsapi.mapex;

import java.util.Objects;

public class Student {

    String name;
    String login;

    public Student() {
    }

    public Student(String name, String login) {
        this.name = name;
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student person = (Student) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(login, person.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
