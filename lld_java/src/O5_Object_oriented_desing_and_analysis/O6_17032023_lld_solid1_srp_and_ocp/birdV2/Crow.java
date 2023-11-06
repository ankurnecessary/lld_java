package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV2;

public class Crow extends Bird implements Flyer, Eater {
    public String breed = "Crow";

    @Override
    public void fly () {
        System.out.println("Bird flies in Type 1 way.");
    }

    @Override
    public void eat () {
        System.out.println("A crow can eat.");
    }
}
