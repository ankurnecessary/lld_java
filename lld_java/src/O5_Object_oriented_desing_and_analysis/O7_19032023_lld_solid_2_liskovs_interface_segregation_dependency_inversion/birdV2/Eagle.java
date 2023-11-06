package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2;

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
