package fr.ensai.library;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.util.List;
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6

public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        String csvFilePath = "books.csv";
        library.loadBooksFromCSV(csvFilePath);

        library.addIem(new Magazine("1234-5678", "Tech Monthly", "Vol. 15, Issue 3", 2023, 120));
        library.addIem(new Magazine("9876-5432", "Vogue Style", "September Edition", 2024, 250));
        library.addIem(new Magazine("1122-3344", "Scientific Discoveries", "Issue 247", 2022, 88));

        library.displayItems();

        System.out.println("\n**********************************************");
        System.out.println("* Books by Stephen King                      *");
        System.out.println("**********************************************");

<<<<<<< HEAD
        ArrayList<Book> skingsBooks = library.getBooksByAuthor(new Author("Stephen King"));
=======
        List<Book> skingsBooks = library.getBooksByAuthor(new Author("Stephen King"));
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6

        for (Book b : skingsBooks) {
            System.out.println(b);
        }
    }
}