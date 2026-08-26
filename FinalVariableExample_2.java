class LibraryBook {
    final String ISBN;
    String title;
    String author;
    double price;
    LibraryBook(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Book ISBN: " + ISBN);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}
public class FinalVariableExample_2 {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(
                "938-1934467640",
                "Atomic Habits",
                "James Clear",
                549.0
        );
        book.display();
    }
}