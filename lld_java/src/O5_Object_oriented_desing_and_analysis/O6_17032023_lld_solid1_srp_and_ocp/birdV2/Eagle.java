package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV2;

public class Eagle extends Bird implements Flyer, Eater {

    public String breed = "Eagle";

    @Override
    public void fly() {
        System.out.println("Bird flies in Type 1 way.");
    }

    @Override
    public void eat() {
        System.out.println("An eagle can eat.");
    }

}
