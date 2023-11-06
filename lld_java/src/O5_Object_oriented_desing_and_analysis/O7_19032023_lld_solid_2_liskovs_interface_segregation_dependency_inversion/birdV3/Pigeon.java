package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV3;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV3.flyingTypes.FlyingType2;

public class Pigeon extends Bird implements Flyer, Eater {
    public String breed = "Pigeon";
    public FlyingType2 flyingType2 = new FlyingType2();

    @Override
    public void fly() { flyingType2.fly(); }

    @Override
    public void eat() {
        System.out.println("A pigeon can eat.");
    }
}
