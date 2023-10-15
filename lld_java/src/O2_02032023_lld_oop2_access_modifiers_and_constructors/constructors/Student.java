package O2_02032023_lld_oop2_access_modifiers_and_constructors.constructors;

public class Student {
    int age;
    String name;
    String gender;

    Student(String  name, int age) {
        System.out.println("Creating a new student" + this.age);
        this.name = name;
        this.age = age;
    }

}
