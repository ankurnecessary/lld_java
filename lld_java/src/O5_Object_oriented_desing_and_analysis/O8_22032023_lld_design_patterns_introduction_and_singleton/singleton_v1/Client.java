package O5_Object_oriented_desing_and_analysis.O8_22032023_lld_design_patterns_introduction_and_singleton.singleton_v1;

public class Client {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.url = "http://google.com";
        Database db2 = Database.getInstance();
        System.out.println(db1.url);
        System.out.println(db2.url);
    }
}
