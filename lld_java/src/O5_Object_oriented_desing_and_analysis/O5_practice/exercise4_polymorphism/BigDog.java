package O5_Object_oriented_desing_and_analysis.O5_practice.exercise4_polymorphism;

public class BigDog extends Dog{
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    public void greeting(Dog another) {
        System.out.println("Wooooowwww!");
    }
}
