package O2_DSA_intermediate.O10_23052022_intermediate_dsa_bit_manipulation_1;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(3));
    }

    public static long reverseBits(long A) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((A & (1 << i)) != 0)
                rev |= 1;
        }

        return rev;
    }
}
