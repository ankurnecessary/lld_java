package O5_Object_oriented_desing_and_analysis.O6_17032023_lld_solid1_srp_and_ocp.birdV1;

public class Client {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.fly();

        Crow crow = new Crow();
        crow.fly();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.fly();
    }
}
