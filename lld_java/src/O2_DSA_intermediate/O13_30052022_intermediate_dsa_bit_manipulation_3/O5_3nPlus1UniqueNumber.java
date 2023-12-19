package O2_DSA_intermediate.O13_30052022_intermediate_dsa_bit_manipulation_3;

/**
 * Given 3n + 1 numbers, every number is repeating thrice except 1 unique number.
 * Find out the unique number.
 */
public class O5_3nPlus1UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5,2,6,6,7,7,7,6,4};
        System.out.println(getUniqueNumber(arr));
    }

    private static int getUniqueNumber(int[] arr) {

        // Doing bitwise addition and creating bitwise sum array
        int[] bitSumArr = new int[32];
        for (int k : arr) {
            int num = k;
            int j = 0;
            while (num > 0) {
                bitSumArr[j] += (num & 1);
                num = num >> 1;
                j++;
            }
        }


        // Running bitwise operation on bitSumArr to get a real number out of it.
        int ans = 0;
        for(int i = 31; i >= 0; i--) {
            ans = ans << 1;
            ans = ans | (bitSumArr[i] % 3);
        }

        return ans;
    }
}
// TC - O(n)
// SC - O(1)
