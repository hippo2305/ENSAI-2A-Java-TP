package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private String name;
    private ArrayList<Item> items;
    private ArrayList<Loan> activeLoans;
    private ArrayList<Loan> completedLoans;

    public Library(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.activeLoans = new ArrayList<>();
        this.completedLoans = new ArrayList<>();
    }

    /**
     * Adds a book to the library
     * 
     * @param book The book object to add to the library
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String displayItems() {
        if (this.items.size() == 0) {
            return "This library is empty !\n";
        } else {
            String returnString = "";
            for (Item item : this.items) {
                returnString += item.toString();
                returnString += "\n";
            }
            return returnString;
        }

    }

    /*
     * public Loan findActiveLoanForItem(Item item) {
     * for (Loan loan : activeLoans) {
     * if (loan.getItem() == item) {
     * return loan;
     * }
     * }
     * }
     */

    /**
     * Loads books from a CSV file and adds them to the library.
     * 
     * @param filePath The path to the CSV file containing book data.
     * @throws IOException If there is an error reading the file, an
     *                     {@link IOException} will be thrown.
     */
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String name = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(name);
                    if (author == null) {
                        author = new Author(name);
                        authors.put(name, author);
                        // System.out.println(String.format("Create %s", author));
                    }
                    Book book = new Book(title, year, pageCount, isbn, author);

                    this.addItem(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}
