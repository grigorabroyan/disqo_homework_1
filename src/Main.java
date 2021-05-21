public class Main {
    public static void main(String[] args) {
        Book book = new Book(new Author("Robert Kiyosaki", "kiyoskai@gmail.com"),
                 "Rich Dad, Poor Dad", 15, 1, 5);
        Book book1 = new Book(new Author("Wisniewski YL", "vishnievski@mail.ru"),
                 "Loneliness on the net", 7, 2, 3);
        Book book2 = new Book(new Author("Sharl Aznavour", "aznavour@gmail.com"),
                 "Memories of My Life", 100, 3, 44);
        Book book3 = new Book(new Author("Nassim Nicholas Taleb", "taleb@gmail.com"),
                 "Antifragile", 50, 1);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
