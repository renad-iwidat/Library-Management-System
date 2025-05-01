
public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, String publishDate, String summary, String genre) {
        super(title, author, publishDate, summary);
        this.genre = genre;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("The book '" + getTitle() + "' by " + getAuthor() + " has been borrowed.");
        } else {
            System.out.println("The book '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("The book '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("The book '" + getTitle() + "' was not borrowed.");
        }
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
