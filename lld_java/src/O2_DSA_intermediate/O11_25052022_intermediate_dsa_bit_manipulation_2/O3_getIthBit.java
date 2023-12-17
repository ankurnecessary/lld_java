package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

/*
* Get ith bit of a number.
* */
public class O3_getIthBit {
    public static void main(String[] args) {
        int num = 13; // 1101
        int i = 1; // 4 -> 1, 5 -> 0
        System.out.println(getIthBit1(num, i));
        System.out.println(getIthBit2(num, i));
    }

    // Approach 2
    private static int getIthBit1(int num, int i) {
        return (num & (1 << (i - 1))) != 0 ? 1 : 0;
    }
    // TC - O(1)
    // SC - O(1)

    // Approach 1
    private static int getIthBit2(int num, int i) {
         return (num >> (i - 1)) & 1;
    }
    // TC - O(1)
    // SC - O(1)

}
