package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2;

public class Penguin extends Bird implements Eater, Flyer {
    public String breed = "Penguin";

    @Override
    public void fly() {
        System.out.println("Bird flies in Type 2 way.");
    }

    @Override
    public void eat() {
        System.out.println("A penguin can eat.");
    }
}
