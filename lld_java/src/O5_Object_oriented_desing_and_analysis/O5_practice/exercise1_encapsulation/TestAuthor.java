package O5_Object_oriented_desing_and_analysis.O5_practice.exercise1_encapsulation;

public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }
}
