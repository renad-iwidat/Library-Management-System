public class Main {
    public static void main(String[] args) {
        // Create the library
        Library library = new Library();

        // Add some items to the library
        library.addLibraryItem(new Book("Java Programming", "John Doe", "2021", "A book about Java programming.", "Programming"));
        library.addLibraryItem(new Magazine("Tech World", "Jane Doe", "2022", "A tech magazine.", 10));

        // Display all items in the library
        library.displayAllItems();

        // Borrow a book
        library.borrowLibraryItem("Java Programming");

        // Display status after borrowing
        library.displayAllItems();

        // Return the book
        library.returnLibraryItem("Java Programming");

        // Display status after returning
        library.displayAllItems();

        // Search for an item
        LibraryItem searchedItem = library.searchLibraryItem("Tech World");
        if (searchedItem != null) {
            searchedItem.displayStatus();
        } else {
            System.out.println("Item not found.");
        }
    }
}
