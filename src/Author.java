public class Author {

    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    @Override
    public String toString () {
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public int hashCode () {
        return java.util.Objects.hash(this.toString());
    }

    public boolean equals(Author author) {
        if (this.getClass() != author.getClass()) {
            return false;
        }
        return this.getFirstName().equals(author.getFirstName()) && this.getLastName().equals(author.getLastName()) && this.hashCode() == author.hashCode();
    }

}
