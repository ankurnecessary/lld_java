package O5_Object_oriented_desing_and_analysis.O5_14032023_lld_oop_method_overloading_overriding_interfaces.abstract_classes;

abstract class Animal {
    String name;
    int age;
    String gender;

    void makeSound() {
        System.out.println("Bla Bla Bla");
    }

    abstract protected void play();
}
