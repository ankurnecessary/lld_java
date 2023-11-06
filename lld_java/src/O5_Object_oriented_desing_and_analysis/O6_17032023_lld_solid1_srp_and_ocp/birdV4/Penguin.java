package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4;

import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV4.flyingTypes.FlyingType2;

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
