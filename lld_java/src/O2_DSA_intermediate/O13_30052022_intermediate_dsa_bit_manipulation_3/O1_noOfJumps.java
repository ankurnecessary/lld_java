package O2_DSA_intermediate.O13_30052022_intermediate_dsa_bit_manipulation_3;

/**
 * There is an enemy at level N above the surface of earth. You are a superhero and standing
 * on earth i.e. at level 0. You can take jumps in powers of 2. Find the minimum jumps that
 * would be needed to reach the enemy.
 */
public class O1_noOfJumps {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(getNoOfJumps(n));
    }

    private static int getNoOfJumps(int n) {
        int noOfJumps = 0;
        while(n > 0) {
            if((n & 1) > 0) {
                noOfJumps++;
            }
            n = n >> 1;
        }
        return noOfJumps;
    }
}
