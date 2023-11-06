package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4;

import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4.flyingTypes.FlyingType1;

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
