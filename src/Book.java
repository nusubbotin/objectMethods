public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString(){
        return "name = " + name + " {" + author.toString() + "} publicationYear = " + publicationYear + " ";
    }
}
