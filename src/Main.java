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

    }
}