package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4.flyingTypes.FlyingType3;

public class Vulture extends Bird implements Flyer, Eater {
    public String breed = "Vulture";
    public FlyingBehaviour flyingType3 = new FlyingType3();

    @Override
    public void fly() {
        flyingType3.fly();
    }

    @Override
    public void eat() {
        System.out.println("A vulture can eat");
    }

}
