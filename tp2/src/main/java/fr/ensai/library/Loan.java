package fr.ensai.library;

import java.time.LocalDate;

public class Loan {
    private Student student;
    private Item item;
    private LocalDate startDate;
    private LocalDate returnDate;

    public Loan(Student student, Item item, LocalDate startDate) {
        this.student = student;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = null;
    }

    public Item getItem() {
        return this.item;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Item " + this.item.toString() + " borrowed by " + this.student.toString();
    }
}
