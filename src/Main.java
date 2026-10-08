public class Main {
    public static void main(String[] args) {

        Author firstAuthor = new Author("Лев","Толстой");
        Author secondAuthor = new Author("Александр", "Пушкин");
        Book firstBook = new Book(1869, firstAuthor, "Война и мир");
        Book secondBook = new Book(1820, secondAuthor, "Руслан и Людмила");
        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());
        firstBook.setYearOfPublication(1870);
        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());

    }
}