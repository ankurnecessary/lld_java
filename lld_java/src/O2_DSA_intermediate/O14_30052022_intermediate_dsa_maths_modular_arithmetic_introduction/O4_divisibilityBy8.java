package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;

/**
 * >>Problem Description
 * You are given a number A in the form of a string. Check if the number is divisible by eight or not.
 * Return 1 if it is divisible by eight else, return 0.
 *
 * >>Problem Constraints
 * 1 <= length of the String <= 100000
 * '0' <= A[i] <= '9'
 *
 * >>Input Format
 * The only argument given is a string A.
 *
 * >>Output Format
 * Return 1 if it is divisible by eight else return 0.
 *
 * >>>>Example Input
 * >>Input 1:
 * A = "16"
 * >>Input 2:
 * A = "123"
 *
 * >>>>Example Output
 * >>Output 1:
 * 1
 * >>Output 2:
 * 0
 *
 * >>>>Example Explanation
 * >>Explanation 1:
 *  16 = 8 * 2
 * >>Explanation 2:
 * 123 = 15 * 8 + 3
 *
 */

public class O4_divisibilityBy8 {
    public static void main(String[] args) {
        String numString = "444";
        System.out.println(divisibilityBy8(numString));
    }

    private static int divisibilityBy8(String numString) {

        int num = numString.charAt(0) - '0';

        for(int i = 1; i < numString.length(); i++) {
            num *= 10;
            num += (numString.charAt(i) - '0');
        }

        return num % 8 == 0 ? 1 : 0;

    }

    // TC - O(n) where n is length of numString
    // SC - O(1)
}
