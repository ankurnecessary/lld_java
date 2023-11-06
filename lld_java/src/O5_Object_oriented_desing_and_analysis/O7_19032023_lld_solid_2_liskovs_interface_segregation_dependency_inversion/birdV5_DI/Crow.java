package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingBehaviour;

public class Crow extends Bird implements Flyer, Eater {
    public String breed = "Crow";
    public FlyingBehaviour flyingType1;

    Crow(FlyingBehaviour flyingType1) {
        this.flyingType1 = flyingType1;
    }

    @Override
    public void fly () {
        flyingType1.fly();
    }

    @Override
    public void eat () {
        System.out.println("A crow can eat.");
    }
}
