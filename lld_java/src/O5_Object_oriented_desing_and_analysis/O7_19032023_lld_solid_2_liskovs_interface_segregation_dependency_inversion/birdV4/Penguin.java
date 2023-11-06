package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4.flyingTypes.FlyingType2;

public class Penguin extends Bird implements Eater, Flyer {
    public String breed = "Penguin";
    public FlyingBehaviour flyingType2 = new FlyingType2();

    @Override
    public void fly() {
        flyingType2.fly();
    }

    @Override
    public void eat() {
        System.out.println("A penguin can eat.");
    }
}
