package fr.ensai.library;

public class Student extends Person {
<<<<<<< HEAD
    public int academicYear;
    public boolean isClassDelegate;

=======
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student.
     * @param name
     */
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }
}