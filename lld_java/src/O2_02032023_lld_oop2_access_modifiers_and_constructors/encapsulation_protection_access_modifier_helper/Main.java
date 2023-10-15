package O2_02032023_lld_oop2_access_modifiers_and_constructors.encapsulation_protection_access_modifier_helper;

import O2_02032023_lld_oop2_access_modifiers_and_constructors.encapsulation_protection_access_modifier.Student;

public class Main {
    public static void main (String[] args) {

        Student st1 = new Student();

        // st1.name = "Ankur"; // Not possible because name has private access

        // st1.age = 40; // Not possible because age has default access modifier. Default attributes and methods are not accessible from other packages

        // st1.gender = "Male"; // Not possible because gender has protected access modifier. Protected attributes and methods are not accessible from the instances in other packages. Student class exist in other package.

        st1.batch = "Bla bla bla"; // It is public attribute. Hence, accessible from anywhere
    }
}
