public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "1984", "George Orwell");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Linear Search for '1984':");
        System.out.println(library.linearSearchByTitle("1984"));

        System.out.println("Binary Search for 'The Great Gatsby':");
        System.out.println(library.binarySearchByTitle("The Great Gatsby"));
    }
}
