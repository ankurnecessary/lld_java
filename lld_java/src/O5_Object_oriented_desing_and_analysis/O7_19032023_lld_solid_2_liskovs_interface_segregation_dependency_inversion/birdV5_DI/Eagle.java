package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingType1;

public class Eagle extends Bird implements Flyer, Eater {

    public String breed = "Eagle";
    public FlyingBehaviour flyingType1;

    Eagle(FlyingBehaviour flyingType1) {
        this.flyingType1 = flyingType1;
    }

    @Override
    public void fly() {
        flyingType1.fly();
    }

    @Override
    public void eat() {
        System.out.println("An eagle can eat.");
    }

}
