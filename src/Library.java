import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;

    public Library() {
        libraryItems = new ArrayList<>();
    }

    // Method to add an item to the library
    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    // Method to borrow an item by title
    public void borrowLibraryItem(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.borrowItem();
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found.");
    }

    // Method to return an item by title
    public void returnLibraryItem(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found.");
    }

    // Method to display the status of all items
    public void displayAllItems() {
        for (LibraryItem item : libraryItems) {
            item.displayStatus();
        }
    }

    // Search for an item by title
    public LibraryItem searchLibraryItem(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null; // Return null if not found
    }
}
