
public abstract class LibraryItem {
    // Fields
    private String title;
    private String author;
    private String publishDate;
    private String summary;
    private boolean isBorrowed; // Default value is false

    // Constructor
    public LibraryItem(String title, String author, String publishDate, String summary) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.summary = summary;
        this.isBorrowed = false;
    }

    // Abstract methods
    public abstract void borrowItem();
    public abstract void returnItem();

    // Concrete method to display status
    public void displayStatus() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + (isBorrowed ? "No" : "Yes"));
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
