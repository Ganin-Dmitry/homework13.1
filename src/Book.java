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
        return "Название: " + this.getTitle() + "\nАвтор: " + this.author.toString() + "\nГод публикации: " + this.getYearOfPublication();
    }

    @Override
    public int hashCode () {
        return java.util.Objects.hash(this.toString());
    }

    public boolean equals (Book book) {
        if (this.getClass() != book.getClass()) {
            return false;
        }
        return this.getAuthor().equals(book.getAuthor()) && this.getTitle().equals(book.getTitle()) && this.getYearOfPublication() == book.getYearOfPublication();
    }

}
