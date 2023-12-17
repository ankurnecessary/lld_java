package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

/*
* Get ith bit of a number.
* */
public class O3_getIthBit {
    public static void main(String[] args) {
        int num = 13; // 1101
        int i = 3; // 4 -> 1, 5 -> 0
        System.out.println(getIthBit(num, i));
    }

    // Approach 2
    private static int getIthBit(int num, int i) {
        return (num >> (i - 1)) & 1;
    }

    // Approach 1
    /* private static int getIthBit(int num, int i) {
        int ans = 0;
        for(int j = 0; j < i; j++) {
            ans = num & 1;
            // System.out.print(ans);
            num >>= 1;
        }
        // System.out.println();
        return ans;
    } */

}
