package O3_04032023_lld_oop3_inheritance_and_polymorphism.copy_constructor;

public class Student {
    int age;
    String name;
    String gender;

    Student() {
        System.out.println("To show constructor overloading");
    }

    /*
    * A copy constructor that takes object of same type
    * */
    Student(Student obj) {
        this.age = obj.age;
        this.name = obj.name;
        this.gender = obj.gender;
    }

}
