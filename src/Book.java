public class Book {

    private int yearOfPublication;
    private Author author;
    private String title;

    public Book (int yearOfPublication, Author author, String title) {
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.title = title;
    }

    public int getYearOfPublication () {
        return this.yearOfPublication;
    }

    public Author getAuthor () {
        return this.author;
    }

    public String getTitle () {
        return this.title;
    }

    public void setYearOfPublication (int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString () {
        return "Название: " + this.title + "\nАвтор: " + this.author.toString() + "\nГод публикации: " + this.yearOfPublication;
    }

}
