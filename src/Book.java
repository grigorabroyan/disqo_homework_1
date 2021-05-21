public class Book {
    Author author;
    public String name;
    public double price;
    public int bookId;
    public int count;

    public Book(Author author, String name, double price, int bookId, int count) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.bookId = bookId;
        this.count = count;
    }

    public Book(Author author, String name, double price, int bookId) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.bookId = bookId;
    }

    public Author getAuthor() {
        return author;
    }
    public String getAuthorName(){
        return author.name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getBookId() {
        return bookId;
    }

    public int getCount() {
        return count;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "" + author +'\n'+
                "book title: " + name + '\n' +
                "price: " + "$ " + price  +'\n'+
                "book Id: " + bookId + '\n' +
                "count: " + count + '\n';
    }
}
