package LabAssignment;

public class Main {
    public static void main(String[] args) {
        // Create library items
        Book book1 = new Book("Urban heroes", "jack", 2002, 400);
        Magazine magazine1 = new Magazine("A deeper insight", "Ken", 2023, 123);

        // Create a library and add items
        Library library = new Library(5);
        library.addItem(book1);
        library.addItem(magazine1);

        library.borrowItem(book1);
      library.displayAvailableItems();
      library.displayBorrowedItems();
    }
}
