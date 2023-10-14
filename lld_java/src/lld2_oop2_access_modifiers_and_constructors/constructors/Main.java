package lld2_oop2_access_modifiers_and_constructors.constructors;

public class Main {
    public static void main (String[] arg) {
        // Student st1 = new Student(); // We cannot do this because we have a custom constructor in Student class with some parameters
        Student st1 = new Student("Ankur", 40);
    }
}
