package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4.flyingTypes.FlyingType1;

public class Crow extends Bird implements Flyer, Eater {
    public String breed = "Crow";
    public  FlyingBehaviour flyingType1 = new FlyingType1();

    @Override
    public void fly () {
        flyingType1.fly();
    }

    @Override
    public void eat () {
        System.out.println("A crow can eat.");
    }
}
