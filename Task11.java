public class Task11{
    private String title;
    private String author;
    private int year;
    private double price;

    public Task11(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Price: $" + price;
    }   

public static void main(String[] args) {
        Task11 book1 = new Task11("Java Programming", "John Smith", 2021, 39.99);
        Task11 book2 = new Task11("Python Programming", "Jane Doe", 2020, 29.99);
        Task11 book3 = new Task11("C++ Programming", "Michael Johnson", 2019, 49.99);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
