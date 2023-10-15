package O2_02032023_lld_oop2_access_modifiers_and_constructors.encapsulation_protection_access_modifier;

public class Main {
    public static void main (String[] args) {
        Student st1 = new Student();

        // st1.name = "Ankur"; // Not possible because name has private access
        st1.age = 40;
    }
}
