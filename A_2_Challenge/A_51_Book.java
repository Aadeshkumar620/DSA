package A_2_Challenge;

class A_15_Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    { // Object Init
        totalNoOfBooks++;
    }

    A_15_Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    A_15_Book (String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        A_15_Book designOfThings = new A_15_Book("1", "Design", "Author");
        A_15_Book myBook = new A_15_Book("2");
        System.out.println(A_15_Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}









