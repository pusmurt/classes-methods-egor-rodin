package Task3;

public class Reader {
    int ticketNumber;
    String fullName;
    String faculty;
    String birthDate;
    String phoneNumber;
    static int studentCount = 0;

    public Reader(int ticketNumber, String fullName, String faculty, String birthDate, String phoneNumber) {
        this.ticketNumber = ticketNumber;
        this.fullName = fullName;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook (int i) {
        System.out.println(fullName + " взял " + i + " книги");
    }

    public void takeBook(String...bookNames) {
        System.out.println(fullName + " взял книги:");
        for (String bookName: bookNames) {
            System.out.println(bookName);
        }
        System.out.println(" ");
    }

    public void takeBook (Book[]books){
        System.out.println(fullName + " взял книги: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(books[i].getBookName() + ", " + books[i].getAuthor());
        }
    }

    public void returnBook (int i) {
        System.out.println(fullName + " вернул " + i + " книги");
    }

    public void returnBook(String...bookNames) {
        System.out.println(fullName + " вернул книги:");
        for (String bookName: bookNames) {
            System.out.println(bookName);
        }
        System.out.println(" ");
    }

    public void returnBook (Book[] books) {
        System.out.println(fullName + " вернул книги: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(books[i].getBookName() + ", " + books[i].getAuthor());
        }
    }
}
