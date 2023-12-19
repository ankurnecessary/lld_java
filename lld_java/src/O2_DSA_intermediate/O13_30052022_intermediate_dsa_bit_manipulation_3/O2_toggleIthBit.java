package O2_DSA_intermediate.O13_30052022_intermediate_dsa_bit_manipulation_3;

/**
 * Toggle ith bit
 */
public class O2_toggleIthBit {
    public static void main(String[] args) {
        // int n = 13, i = 1; // 15
        int n = 38, i = 2; // 34
        System.out.println(toggleIthBit(n, i));
    }

    private static int toggleIthBit(int n, int i) {
        return n ^ (1<<i);
    }
}
