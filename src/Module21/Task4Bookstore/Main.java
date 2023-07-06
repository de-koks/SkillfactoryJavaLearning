package Module21.Task4Bookstore;

/*
Написать программу «Книжный магазин», расположенную в специальном пакете.
В программе создать класс «книга», состояние которого описывается параметрами: «название книги» (строковый), «цена» (целочисленный), «дата издания» (целочисленный).
В основном классе создать «картотеку книг», представленную массивом «книг».
В основном или отдельном классе создать статический метод/методы, который будет осуществлять проверку по параметрам «название книги» и «год выпуска».
Есть ли такая книга в картотеке: если есть — выдавать соответствующее сообщение, если нет — добавлять книгу в картотеку (выдавать сообщения о добавлении книги).
Если массив (картотека) заполнен — выдавать сообщение об этом.
Проверку строчных параметров («название книги») можно организовать встроенным методом String equals.
Добавить метод, который выводит в консоль (на печать) всю информацию о всех книгах (название, год издания, цену) без конкатенации, при помощи форматирования.
Пример вывода:
книга №1: название: "The Hobbit", год издания: 1937г., цена - 999usd
книга №2: название: "......", год издания: …...г., цена - ….usd
 */
public class Main {
    public static void main(String[] args) {

        Book[] catalogue = new Book[5];

        Book book1 = new Book();
        book1.setBookName("The Hobbit");
        book1.setBookPrice((short)180);
        book1.setYearOfIssue((byte)1937);

        addBook(catalogue, book1);

        Book book2 = new Book();
        book1.setBookName("Dune");
        book1.setBookPrice((short)200);
        book1.setYearOfIssue((byte)1965);

        addBook(catalogue, book2);
        printAllBookList(catalogue);
    }
    public static boolean checkBook(Book[] catalogue, Book book) {

        for (Book item: catalogue) {
            if (item != null && item.getBookName().equals(book.getBookName()) && item.getYearOfIssue() == book.getYearOfIssue()) {
                System.out.println("Данная книга уже есть в каталоге");
                return true;
            }
        }
        System.out.println("Данной книги нет в каталоге");
        return false;
    }
    public static void addBook(Book[] catalogue, Book book) {
        if (!checkBook(catalogue, book)) {
            for (int i = 0; i < catalogue.length; i++) {
                if (catalogue[i] == null) {
                    catalogue[i] = book;
                    System.out.println("Книга добавлена в каталог");
                    break;
                }
                if (i == catalogue.length - 1) {
                    System.out.println("Каталог переполнена");
                }
            }
        }
    }
    public static void printAllBookList(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i + 1, bookList[i].getBookName(), bookList[i].getYearOfIssue(), bookList[i].getBookPrice());
            }
        }
    }
}
