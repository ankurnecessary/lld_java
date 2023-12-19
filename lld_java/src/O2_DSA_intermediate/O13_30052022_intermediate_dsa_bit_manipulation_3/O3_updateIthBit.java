package O2_DSA_intermediate.O13_30052022_intermediate_dsa_bit_manipulation_3;

/**
 * Update ith bit to binary
 */
public class O3_updateIthBit {
    public static void main(String[] args) {
        // int n = 13, i = 2, binary = 0; // 9
        int n = 13, i = 1, binary = 0; // 13
        // int n = 13, i = 1, binary = 1; // 15
        System.out.println(updateIthBit(n,i,binary));
    }

    private static int updateIthBit(int n, int i, int binary) {
        // step 1
        int mask = ~(1 << i);
        n = n & mask;

        // step 2
        // return binary == 0 ? n : (n | (1 << i));
        return n | (binary << i);
    }
}
