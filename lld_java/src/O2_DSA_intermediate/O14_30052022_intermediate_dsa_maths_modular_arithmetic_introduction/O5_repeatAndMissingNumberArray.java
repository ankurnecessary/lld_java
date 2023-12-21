package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.scaler.com/academy/mentee-dashboard/class/25471/homework/problems/60/?navref=cl_pb_nv_tb
 * There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
 * This is one of those problems.
 * Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105
 *
 * Food for thought :
 *
 * Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
 * For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
 * Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
 * Obviously approach 1 is more susceptible to overflows.
 * You are given a read only array of n integers from 1 to n.
 *
 * Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Note that in your output A should precede B.
 *
 * Example:
 *
 * Input:[3 1 2 5 3]
 *
 * Output:[3, 4]
 *
 * A = 3, B = 4
 */

public class O5_repeatAndMissingNumberArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,2};
        ArrayList<Integer> arrList = new ArrayList(Arrays.asList(arr));
        System.out.println(repeatAndMissingNumberArray(arrList));
    }

    private static ArrayList<Integer> repeatAndMissingNumberArray(ArrayList<Integer> A) {

        ArrayList<Integer> ansArr = new ArrayList(2);
        long n = A.size();

        long a = 0,
            b = n * (n + 1) / 2,
            aSq = 0,
            bSq = n * (n+1) * ((2*n)+1) / 6;

        for(int i = 0; i < A.size(); i++) {
            a += A.get(i);
            aSq += ((long)A.get(i) * (long)A.get(i));
        }

        long val1 = a - b; // a - b
        long val2 = aSq - bSq; // a^2 - b^2 = (a+b)(a-b)
        long val3 = val2 / val1; // a + b

        a = (val1 + val3) / 2;
        b = val3 - a;

        ansArr.add((int)a);
        ansArr.add((int)b);

        return ansArr;
    }
    // TC - O(n)
    // SC - O(1)
}
