package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingType3;

public class Sparrow extends Bird implements Flyer, Eater {
    public String breed = "Sparrow";
    public FlyingBehaviour flyingType3;

    Sparrow(FlyingBehaviour flyingType3) {
        this.flyingType3 = flyingType3;
    }

    @Override
    public void fly() {
        flyingType3.fly();
    }

    @Override
    public void eat() {
        System.out.println("A sparrow can eat.");
    }

}
