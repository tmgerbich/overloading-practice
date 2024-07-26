public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.year = 2010;
    }

    public Book(int pages, int year) {
        this.title = "Green Eggs and Ham";
        this.pages = pages;
        this.year = year;
    }

    public Book(String title) {
        this.title = title;
        this.pages = 200;
        this.year = 2010;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "" + this.title + ", " + this.pages + " pages, " + this.year;
    }


}
