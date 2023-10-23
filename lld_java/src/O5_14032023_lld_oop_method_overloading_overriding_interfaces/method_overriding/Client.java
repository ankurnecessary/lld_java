package O5_14032023_lld_oop_method_overloading_overriding_interfaces.method_overriding;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.makeSound());
        dog.makeSound(2);

        Animal animal = new Dog();
        animal.makeSound(3);
    }
}
