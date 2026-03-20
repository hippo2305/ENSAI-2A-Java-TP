package fr.ensai.library;

public abstract class Item {
    protected String title;
    protected int year;
    protected int pageCount;

<<<<<<< HEAD
    public Item(String title, int year, int pageCount) {
=======
    /**
     * Common constructor for Items.
     */
    protected Item(String title, int year, int pageCount) {
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    // Abstract method to enforce implementation in child classes
    public abstract String toString();

    public String getTitle() {
<<<<<<< HEAD
        return title;
=======
        return this.title;
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }

}
