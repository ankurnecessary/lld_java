package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

/*
* Get the no. of set bits of a positive integer
* */
public class O1_noOfSetBits {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(noOfSetBits(num));
    }

    // Brute force
    /* private static int noOfSetBits(int num) {
        int ans = 0;

        while(num != 0) {
            if(num % 2 == 1) ans++;
            num = num / 2;
        }

        return ans;
    }
    TC - O(log n)
    SC - O(1)
    */

    // Optimal way
    private static int noOfSetBits(int num) {
        int ans = 0;

        while(num != 0) {
            if((num & 1) != 0) ans++;
            num = num >>> 1;
        }

        return ans;
    }
    // TC - O(1)
    // SC - O(1)
}
