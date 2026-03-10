package fr.ensai.library;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two authors are considered equal if their names are equal.
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Person person = (Person) obj;
        return Objects.equals(this.name, person.name);
    }
}
