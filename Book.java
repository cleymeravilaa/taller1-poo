public class Book {
    private String title;
    private int numPages;
    private String author;

    public Book(){
        this.title = "undefined";
        this.numPages = 0;
        this.author = "undefined";
    }

    public Book(String title, int numPages, String author) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Libro [title=" + title + ", numPages=" + numPages + ", author=" + author + "]";
    }
    
}