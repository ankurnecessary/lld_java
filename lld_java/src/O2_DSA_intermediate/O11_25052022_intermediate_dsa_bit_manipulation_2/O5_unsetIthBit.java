package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

/**
 * Unset ith bit
 */
public class O5_unsetIthBit {
    public static void main(String[] args) {
        int num = 13, i = 2;
        System.out.println(unsetIthBit(num, i));
    }

    private static int unsetIthBit(int num, int i) {
        return num ^ (1<<i);
    }
    // TC - O(1)
    // SC - O(1)
}
