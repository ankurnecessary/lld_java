package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV3;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV3.flyingTypes.FlyingType3;

public class Sparrow extends Bird implements Flyer, Eater {
    public String breed = "Sparrow";
    public FlyingType3 flyingType3 = new FlyingType3();

    @Override
    public void fly() {
        flyingType3.fly();
    }

    @Override
    public void eat() {
        System.out.println("A sparrow can eat.");
    }

}
