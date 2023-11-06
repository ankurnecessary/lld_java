package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV1;

abstract public class Bird {

    public String name;
    public String color;
    public long weight;
    public String breed;
    public int age;
    public long beakSize;

    /*
        To counter the problem of touching the flying method again and again and violating SRP and OCP, we converted Bird class into abstract and
        it's method fly() to abstract method. Now we can provide specific implementations of fly method via child classes of Bird class.

        But not all birds could fly because of which we can say that we can see the violation of LSP of SOLID principles.
        We will take care of it in next version.
    */
    abstract public void fly();

    public void eat() {
        System.out.println("All birds eat in similar way");
    }

    public void makeSound() {
        System.out.println("All birds make sound in similar way");
    }

}
