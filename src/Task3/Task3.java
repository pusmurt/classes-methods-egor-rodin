package Task3;

public class Task3 {
    static void main(String[] args) {
        Reader [] readers = {
                new Reader(1, "Иванов Иван Иванович", "Юридический факультет", "10.06.1994", "+79899993738"),
                new Reader(2, "Александров Александр Александрович", "Биологический факультет", "13.04.1998", "+79269270806"),
        };
        Book[] books = {
                new Book("Война и мир", "Лев Николаевич Толстой"),
                new Book("Игрок", "Фёдор Михайлович Достоевский"),
                new Book("Хамелеон", "Антон Павлович Чехов"),
        };
        String[] bookNames = {
                ("Война и мир"),
                ("Игрок"),
                ("Хамелеон"),
        };

        System.out.println("Задача #3");
        readers[0].returnBook(3);
        readers[1].returnBook(3);
        System.out.println(" ");
        readers[0].returnBook(bookNames);
        readers[1].returnBook(bookNames);
        readers[0].returnBook(books);
        System.out.println(" ");
        readers[1].returnBook(books);
        System.out.println(" ");
        readers[0].takeBook(3);
        readers[1].takeBook(3);
        System.out.println(" ");
        readers[0].takeBook(bookNames);
        readers[1].takeBook(bookNames);
        readers[0].takeBook(books);
        System.out.println(" ");
        readers[1].takeBook(books);

    }
}
