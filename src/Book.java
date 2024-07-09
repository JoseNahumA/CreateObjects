public class Book {
    // Attributes
    public String title;
    public String author;
    public int yearPublication;
    public String genre;
    public int numPages;

    // Constructor method
    public Book(String title, String author, int yearPublication, String genre, int numPages) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
        this.genre = genre;
        this.numPages = numPages;
    }

    // Méthods
    public void showInformation() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year of Publication: " + this.yearPublication);
        System.out.println("Genre: " + this.genre);
        System.out.println("Number of pages: " + this.numPages);
    }

    public void available() {
        System.out.println("The book is available.");
    }

    public void notAvailable() {
        System.out.println("The book is not available.");
    }
}