package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV2;

public class Vulture extends Bird implements Flyer, Eater {
    public String breed = "Vulture";

    @Override
    public void fly() {
        System.out.println("Bird flies in Type 3 way.");
    }

    @Override
    public void eat() {
        System.out.println("A vulture can eat");
    }

}
