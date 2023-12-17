package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

public class O4_setIthBit {
    public static void main(String[] args) {
        int num = 13, i = 1; // 1101 -> 1111
        System.out.println(setIthBit(num, i));
    }

    private static int setIthBit(int num, int i) {
        return num | (1<<i);
    }
    // TC - O(1)
    // SC - O(1)
}
