package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV0;

/*
    Assume you have to build software that has to store information about all the birds on the planet.
    How will you design your class etc. to do that?
*/
/*
    This Bird class doesn't follow the SRP and OCP principle of SOLID design principles.
    We need to again and again visit the Bird class' fly() method whenever we will add a new breed of the bird.
    This behaviour shows the violation of Single Responsibility Principle (SRP) and
    Open Close Principle (OCP).
*/
public class Bird {
    public String name;
    public String color;
    public long weight;
    public String breed;
    public int age;
    public long beakSize;

    public void fly() {
        if(breed.equalsIgnoreCase("sparrow")) {
            System.out.println("I fly like a sparrow");
        }
        else if (breed.equalsIgnoreCase("crow")) {
            System.out.println("I fly like a crow");
        }
        else if(breed.equalsIgnoreCase("pigeon")) {
            System.out.println("I fly like a pigeon");
        }
        else {
            System.out.println("I don't know how to fly");
        }
    }

    public void eat() {
        System.out.println("All birds eat in similar way");
    }

    public void makeSound() {
        System.out.println("All birds make sound in similar way");
    }
}
