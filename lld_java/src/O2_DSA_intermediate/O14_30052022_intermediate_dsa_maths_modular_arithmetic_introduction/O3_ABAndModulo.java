package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;

/**
 * >>Problem Description
 * Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
 *
 * >>Problem Constraints
 * 1 <= A, B <= 109
 * A != B
 *
 * >>Input Format
 * The first argument is an integer A.
 * The second argument is an integer B.
 *
 * >>Output Format
 * Return an integer denoting the greatest possible positive M.
 *
 * >>>>Example Input
 * >>Input 1:
 * A = 1
 * B = 2
 *
 * >>Input 2:
 * A = 5
 * B = 10
 *
 * >>>>Example Output
 * >>Output 1:
 * 1
 * >>Output 2:
 * 5
 *
 * >>>>Example Explanation
 * >>Explanation 1:
 * 1 is the largest value of M such that A % M == B % M.
 * >>Explanation 2:
 * For M = 5, A % M = 0 and B % M = 0.
 * No value greater than M = 5, satisfies the condition.
 *
 */

public class O3_ABAndModulo {
    public static void main(String[] args) {
        int A = 5, B = 11;
        System.out.println(ABAndModulo(A, B));
    }

    private static int ABAndModulo(int A, int B) {
        if(A == B) {
            return A;
        }
        return Math.abs(A-B);
    }
    // TC - O(1)
    // SC - O(1)
}
