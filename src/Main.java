public class Main {
    public static void main(String[] args) {
        taks1();
    }

    private static void taks1() {
        System.out.println("Задание 1:");

        Author perov = new Author("Petr", "Perov");
        Author sidorov = new Author( "Seny", "Sidorov");

        Book deskBook = new Book("Настольная книга", perov, 2005);
        System.out.println("deskBook.toString(): " + deskBook);

        Book tutorialBook = new Book("Самоучитель", sidorov, 2001);
        System.out.println("tutorialBook.toString():" + tutorialBook);

        tutorialBook.setPublicationYear(2015);
        System.out.println("tutorialBook.toString(): " + tutorialBook);

        System.out.println("perov.hashCode() = " + perov.hashCode());
        System.out.println("sidorov.hashCode() = " + sidorov.hashCode());

        System.out.println();
        Author author = new Author("Petr", "Perov");
        Author authorDuplicate = new Author( author.getName(), author.getSurname());

        System.out.println("author.hashCode() = " + author.hashCode());
        System.out.println("authorDuplicate.hashCode() = " + authorDuplicate.hashCode());

        System.out.println();
        if (author.equals(authorDuplicate)) {
            System.out.println("author and authorDuplicate is equal");
        }
    }
}