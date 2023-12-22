package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;

import java.util.Arrays;

/**
 * >>Problem Description
 * Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.
 *
 * Return the minimum result obtained.
 *
 * >>Problem Constraints
 * 10 <= A, B, C <= 99
 *
 * >>Input Format
 * The first argument of input contains an integer, A.
 * The second argument of input contains an integer, B.
 * The third argument of input contains an integer, C.
 *
 * >>Output Format
 * Return an integer representing the answer.
 *
 * >>>>Example Input
 * >>Input 1:
 *  A = 10
 *  B = 20
 *  C = 30
 * >>Input 2:
 *  A = 55
 *  B = 43
 *  C = 47
 *
 *
 * >>>>Example Output
 * >>Output 1:
 *  102030
 * >>Output 2:
 *  434755
 *
 *
 * >>>>Example Explanation
 * >>Explanation 1:
 *  10 + 20 + 30 = 102030
 * >>Explanation 2:
 *  43 + 47 + 55 = 434755
 */

public class O6_concatinate3Numbers {
    public static void main(String[] args) {
        int a = 51, b = 63, c=51;
        System.out.println(concatinate3Numbers(a, b, c));
        System.out.println(concatinate3Numbers1(a, b, c));
    }


    private static int concatinate3Numbers(int A, int B, int C) {
        int[] arr = {A, B, C};
        Arrays.sort(arr);
        return arr[0] * 10000 + arr[1] * 100 + arr[2];
    }
    // TC - O(1)
    // SC - O(1)
    private static int concatinate3Numbers1(int A, int B, int C) {
        int min = Math.min(A, B);
        min = Math.min(min, C);

        int max = Math.max(A, B);
        max = Math.max(max, C);

        int xorVal = A ^ B ^ C;

        // Handling mid if 2 values out of A, B and C are equal
        int mid = 0;
        if(xorVal == A) mid = B;
        if(xorVal == B) mid = A;
        if(xorVal == C) mid = A;

        // Handling if none of A, B and C are same
        if(mid == 0) {
            if(A > min && A < max) {
                mid = A;
            }
            else if(B > min && B < max) {
                mid = B;
            }
            else {
                mid = C;
            }
        }

        return (min * 100 + mid) * 100 + max ;
    }
    // TC - O(1)
    // SC - O(1)
}
