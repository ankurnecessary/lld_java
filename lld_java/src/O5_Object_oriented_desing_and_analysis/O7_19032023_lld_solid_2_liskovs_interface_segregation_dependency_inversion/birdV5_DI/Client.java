package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.Crow;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.Eagle;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.Penguin;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.Pigeon;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.Sparrow;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.Vulture;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingBehaviour;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingType1;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingType2;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV5_DI.flyingTypes.FlyingType3;

public class Client {
    public static void main(String[] args) {

        FlyingBehaviour fb1 = new FlyingType1();
        Crow crow = new Crow(fb1);
        crow.eat();
        crow.fly();

        FlyingBehaviour fb2 = new FlyingType1();
        Eagle eagle = new Eagle(fb2);
        eagle.eat();
        eagle.fly();

        FlyingBehaviour fb3 = new FlyingType2();
        Penguin penguin = new Penguin(fb3);
        penguin.eat();
        penguin.fly();

        FlyingBehaviour fb4 = new FlyingType2();
        Pigeon pigeon = new Pigeon(fb4);
        pigeon.eat();
        pigeon.fly();

        FlyingBehaviour fb5 = new FlyingType3();
        Sparrow sparrow = new Sparrow(fb5);
        sparrow.eat();
        sparrow.fly();

        FlyingBehaviour fb6 = new FlyingType3();
        Vulture vulture = new Vulture(fb6);
        vulture.eat();
        vulture.fly();

    }
}
