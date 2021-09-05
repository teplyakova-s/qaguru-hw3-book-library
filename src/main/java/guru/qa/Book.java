package guru.qa;

public class Book {
    String title;
    String author;
    int edition;
    int year;
    boolean archived;
    String readerStatus;

    public Book(String title, String author, int edition, boolean archived, int year) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.archived = archived;
        this.year = year;
    }

    public Book(String title, String author, int edition, boolean archived, int year, String readerStatus) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.year = year;
        this.archived = archived;
        this.readerStatus = readerStatus;
    }

    public void setStatus(String readerStatus) {
        this.readerStatus = readerStatus;
    }

    public String getStatus() {
        return readerStatus;
    }

    public void viewBookInfo() {
        System.out.println("The book title is '" +  title + "'.\n" + "The author is " + author + ".\n" + "We have the edition #" + edition + " of this book.");
    }

    public void checkStatus() {
        System.out.println("The status of the book is " + readerStatus + ".");
    }

    public void archivedStatus() {
        if (archived == true) {
            System.out.println("This book is archived!");
        } else {
            System.out.println("This book is not archived!");
        }
    }

    public void newnessStatus() {
        if (2021 > year && year >= 2015) {
            System.out.println("This book was published during the last 6 years!");
        } else if (2015 > year) {
            System.out.println("This book was published before 2015!");
        } else {
            System.out.println("This book is the newest one!");
        }
    }
}
