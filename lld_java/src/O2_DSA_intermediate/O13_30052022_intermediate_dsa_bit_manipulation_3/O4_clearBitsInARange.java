package O2_DSA_intermediate.O13_30052022_intermediate_dsa_bit_manipulation_3;

public class O4_clearBitsInARange {

    public static void main(String[] args) {
        int n = 20, i = 0, j = 3;
        System.out.println(clearBitsInARange(n,i,j));
    }

    public static int clearBitsInARange(int num, int i, int j) {
        int maskPart1 = -1 << (j+1);
        int maskPart2 = (1<<i) - 1;
        int mask = maskPart1 | maskPart2;
        return num & mask;
    }

}
