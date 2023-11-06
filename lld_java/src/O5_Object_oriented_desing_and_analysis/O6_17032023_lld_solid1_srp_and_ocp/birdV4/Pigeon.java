package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4;

import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4.flyingTypes.FlyingType2;

public class Pigeon extends Bird implements Flyer, Eater {
    public String breed = "Pigeon";
    public FlyingBehaviour flyingType2 = new FlyingType2();

    @Override
    public void fly() { flyingType2.fly(); }

    @Override
    public void eat() {
        System.out.println("A pigeon can eat.");
    }
}
