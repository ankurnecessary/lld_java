package O5_Object_oriented_desing_and_analysis.O2_02032023_lld_oop2_access_modifiers_and_constructors.encapsulation_protection_access_modifier_helper;

import O5_Object_oriented_desing_and_analysis.O2_02032023_lld_oop2_access_modifiers_and_constructors.encapsulation_protection_access_modifier.Student;

public class StudentChild extends Student {

    public void do11() {
        // name = "Test"; // It is a private attribute. So, not accessible outside the class
        // age = 41; // It is a default attribute. So, not accessible outside its own package
        gender = "Male"; // It is a protected attribute. So, it is accessible via child class, outside its own package
        batch = "bla bla bla"; // It is a public attribute
    }

}
