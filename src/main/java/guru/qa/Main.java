package guru.qa;

public class Main {

    static int count;

    public static void main(String[] args) {
        Book book1 = new Book("The Gambler", "Fyodor Dostoevsky", 5, true, 1989);
        count++;
        book1.viewBookInfo();
        book1.newnessStatus();
        book1.archivedStatus();

        Book book2 = new Book("Effective Java", "Joshua Bloch", 3, false, 2021, "reserved");
        count++;
        book2.viewBookInfo();
        book2.newnessStatus();
        book2.archivedStatus();
        book2.checkStatus();
        book2.setStatus("available");
        System.out.println("The new status of the book - " + book2.getStatus() + "!");

        System.out.println("The total number of the books in our library: " + count);
    }
}
