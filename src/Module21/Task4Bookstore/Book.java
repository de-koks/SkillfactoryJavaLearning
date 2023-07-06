package Module21.Task4Bookstore;

public class Book {
    private String bookName;
    private short bookPrice;
    private byte yearOfIssue;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public short getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(short bookPrice) {
        this.bookPrice = bookPrice;
    }

    public byte getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(byte yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
