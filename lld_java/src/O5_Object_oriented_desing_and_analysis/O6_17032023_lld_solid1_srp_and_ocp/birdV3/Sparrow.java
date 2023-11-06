package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV3;

import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV3.flyingTypes.FlyingType3;

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
