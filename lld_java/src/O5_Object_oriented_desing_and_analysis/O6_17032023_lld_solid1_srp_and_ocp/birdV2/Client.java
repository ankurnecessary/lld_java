package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV2;

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
