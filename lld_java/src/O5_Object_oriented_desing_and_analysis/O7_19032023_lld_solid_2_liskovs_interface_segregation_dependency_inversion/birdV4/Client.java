package O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV4;

import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2.Crow;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2.Eagle;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2.Penguin;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2.Pigeon;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2.Sparrow;
import O5_Object_oriented_desing_and_analysis.O7_19032023_lld_solid_2_liskovs_interface_segregation_dependency_inversion.birdV2.Vulture;

public class Client {
    public static void main(String[] args) {

        Crow crow = new Crow();
        crow.eat();
        crow.fly();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.fly();

        Pigeon pigeon = new Pigeon();
        pigeon.eat();
        pigeon.fly();

        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        Vulture vulture = new Vulture();
        vulture.eat();
        vulture.fly();

    }
}
