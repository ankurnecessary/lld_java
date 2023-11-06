package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV2;

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
