package fr.ensai.library;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "The Fellowship of the Ring",
                1954,
                423,
                "978-0-618-26025-6",
                tolkien);

        Magazine vogue1 = new Magazine("Vogue", 2025, 50, "", 356);

        Magazine vogue2 = new Magazine("Vogue", 2025, 50, "", 357);

        Library myLibrary = new Library("Ma Bibliothèque");

        myLibrary.addItem(fellowshipOfTheRing);

        myLibrary.addItem(vogue1);

        myLibrary.addItem(vogue2);

        System.out.println(myLibrary.displayItems());

        Library emptyLibrary = new Library("Bibliothèque vide");

        System.out.println(emptyLibrary.displayItems());

        Student student1 = new Student("Hippolyte Cotterot", 22, 2);

        Loan loan1 = new Loan(student1, fellowshipOfTheRing, LocalDate.of(2026, 3, 10));

        System.out.println(loan1);
    }
}