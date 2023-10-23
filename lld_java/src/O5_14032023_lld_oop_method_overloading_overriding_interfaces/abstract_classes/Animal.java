package O5_14032023_lld_oop_method_overloading_overriding_interfaces.abstract_classes;

abstract class Animal {
    String name;
    int age;
    String gender;

    void makeSound() {
        System.out.println("Bla Bla Bla");
    }

    abstract protected void play();
}
