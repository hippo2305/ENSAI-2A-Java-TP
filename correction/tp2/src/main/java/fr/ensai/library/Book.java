package fr.ensai.library;

/**
 * Represents a book.
 */
public class Book extends Item {

    // Attributes
    private String isbn;
    private Author author;

    /**
     * Constructs a new Book object.
     */
    public Book(String isbn, String title, Author author, int year, int pageCount) {
        super(title, year, pageCount);
        this.isbn = isbn;
        this.author = author;
    }

    public Author getAuthor() {
<<<<<<< HEAD
        return author;
=======
        return this.author;
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Book " + title + " written by " + author.toString();
=======
        return String.format("Book %s written by %s", this.title, this.author);
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }

}
