package fr.ensai.library;

public class Magazine extends Item {
    // Attributes
    private String issn;
    private String issueNumber;

<<<<<<< HEAD
    // Constructor
=======
    /**
     * Constructs a new Magazine object.
     */
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    public Magazine(String issn, String title, String issueNumber, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Magazine " + title;
=======
        return String.format("Magazine %s", this.title);
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }

}
