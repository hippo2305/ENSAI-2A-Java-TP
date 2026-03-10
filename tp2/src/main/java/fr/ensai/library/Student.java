package fr.ensai.library;

/**
 * Represents an Author.
 */
public class Student extends Person {

    // Attributes
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Book object.
     */
    public Student(String name, int age, int academicYear) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = false;
    }

    @Override
    public String toString() {
        return "Student " + this.name;
    }

}
