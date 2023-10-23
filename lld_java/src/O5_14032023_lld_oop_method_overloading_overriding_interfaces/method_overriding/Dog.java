package O5_14032023_lld_oop_method_overloading_overriding_interfaces.method_overriding;

public class Dog extends Animal {
    void makeSound(int num) {
        System.out.println("Bhow: " + num);
    }

    String makeSound() {
        return "Bhow";
    }
}
