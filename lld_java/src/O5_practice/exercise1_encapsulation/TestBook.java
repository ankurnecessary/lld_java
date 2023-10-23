package O5_practice.exercise1_encapsulation;

public class TestBook {
    public static void  main (String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Author anotherAuthor = new Author("Tank Ahk Teck", "tahkteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("mor Java for dummy", anotherAuthor, 29.95, 888);
        System.out.println(aBook.getAuthor().getName() + " (" + aBook.getAuthor().getEmail() + ")");
        System.out.println(anotherBook.getAuthor().getName() + " (" + anotherBook.getAuthor().getEmail() + ")");
    }
}
