package lld2_oop2_access_modifiers_and_constructors.encapsulation_binding;

public class Student {
    String name;
    int age;
    double psp;
    String batch;

    void login () {
        System.out.println(name + " has logged in.");
    }

    void increasePsp (int newPsp) {
        psp = newPsp;
    }
}
