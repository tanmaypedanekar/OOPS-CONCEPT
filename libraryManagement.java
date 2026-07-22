<<<<<<< HEAD
public class libraryManagement {
    // instance variable
    static int totalBooks = 122;
    String title;
    String author;
    boolean isBorrowed;

    // paramiterized constructor;

    libraryManagement(String title) {
        this.title = title; // this keyword gives the first prefrance to instance varible title and store
                            // the value in it.
        author = "abdul kalam";

    }

    // instance methoods
    public void borrowBook() {
        System.out.println("WELCOME TO BORROW BOOK MECHANISM: ");
        if (isBorrowed) {
            System.out.println("this book is already borwwoed");
        } else {
            isBorrowed = true;
            System.out.println("enjoy the book");
        }
    }

    public void returnBook() {

        System.out.println("WELCOME TO RETURN BOOK MECHANISM: ");
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("return completed");

        } else {
            System.out.println("The book is already in the library");
        }
    }

    public static void main(String[] args) {
        libraryManagement book = new libraryManagement("Tanmay");
        book.borrowBook();
        book.returnBook();
    }

}
=======
public class libraryManagement {
    // instance variable
    static int totalBooks = 122;
    String title;
    String author;
    boolean isBorrowed;

    // paramiterized constructor;

    libraryManagement(String title) {
        this.title = title; // this keyword gives the first prefrance to instance varible title and store
                            // the value in it.
        author = "abdul kalam";

    }

    // instance methoods
    public void borrowBook() {
        System.out.println("WELCOME TO BORROW BOOK MECHANISM: ");
        if (isBorrowed) {
            System.out.println("this book is already borwwoed");
        } else {
            isBorrowed = true;
            System.out.println("enjoy the book");
        }
    }

    public void returnBook() {

        System.out.println("WELCOME TO RETURN BOOK MECHANISM: ");
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("return completed");

        } else {
            System.out.println("The book is already in the library");
        }
    }

    public static void main(String[] args) {
        libraryManagement book = new libraryManagement("Tanmay");
        book.borrowBook();
        book.returnBook();
    }

}
>>>>>>> fbd3111 (Added student class)
