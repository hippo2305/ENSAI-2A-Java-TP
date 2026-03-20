package fr.ensai.library;

import java.util.Objects;

public class Author extends Person {

    // Attributes
<<<<<<< HEAD
    public String nationality;

    // Constructor
=======
    private String nationality;

    /**
     * Constructs a new Author.
     */
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    public Author(String name) {
        super(name);
    }

    // Methods
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
<<<<<<< HEAD
        return Objects.equals(name, author.name);
=======
        return Objects.equals(this.name, author.name);
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Author " + name;
=======
        return String.format("Author %s", this.name);
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    }
}
