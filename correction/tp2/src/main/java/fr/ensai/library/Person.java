package fr.ensai.library;

public class Person {

    // Attributes
<<<<<<< HEAD
    public String name;
    public int age;

    // Constructor
=======
    protected String name;
    protected int age;

    /**
     * Constructs a new Person.
     * @param name
     */
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    public Person(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    // Constructor
=======
    /**
     * Constructs a new Person.
     * @param name
     * @param age
     */
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void birthday() {
        this.age += 1;
    }

    public String toString() {
<<<<<<< HEAD
        return this.getClass() + " " + this.name;
=======
        return String.format("%s %s",this.getClass().getSimpleName(), this.name);
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }
}
