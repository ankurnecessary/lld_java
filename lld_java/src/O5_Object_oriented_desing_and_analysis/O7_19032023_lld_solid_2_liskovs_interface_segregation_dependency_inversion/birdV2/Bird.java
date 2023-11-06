package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2;

interface Flyer {
    public void fly();
}

interface Eater {
    public void eat();
}

public class Bird {
    public String name;
    public String color;
    public long weight;
    public String breed;
    public int age;
    public long beakSize;

    /*
        V1 - To counter the problem of touching the flying method again and again and violating SRP and OCP, we converted Bird class into abstract and
        it's method fly() to abstract method. Now we can provide specific implementations of fly method via child classes of Bird class.

        But not all birds could fly because of which we can say that we can see the violation of LSP of SOLID principles.
        We will take care of it in next version.

        V2 - To fix the violation of LSP SOLID principle we will remove the fly method from the Bird class.
        And we will keep only those methods which are actually generic to all the birds.
        We will make an interface Flyer for flying behaviour.
        We are also making interface Eater for eating behaviour.
        In this version birds which could fly implements Flyer interface.
        And birds that could eat implements Eater interface.
        But now we have the issue that we have same code written in the fly() method of various child classes.
        That means code redundancy which we will be handling in the next version.
    */

    public void makeSound() {
        System.out.println("All birds make sound in similar way");
    }

}
