package O5_Object_oriented_desing_and_analysis.O5_practice.exercise4_polymorphism;

public class Dog extends Animal{
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Wooooooooof!");
    }
}
