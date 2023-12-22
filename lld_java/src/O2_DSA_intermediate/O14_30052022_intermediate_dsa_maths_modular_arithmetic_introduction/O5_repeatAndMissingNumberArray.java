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
        Integer[] arr = {1,2,3,4,1,6};
        ArrayList<Integer> arrList = new ArrayList(Arrays.asList(arr));
        System.out.println(repeatAndMissingNumberArray(arrList));
        System.out.println(repeatAndMissingNumberArray1(arrList));
    }

    // Using bitwise operator xor
    private static ArrayList<Integer> repeatAndMissingNumberArray(ArrayList<Integer> A) {
        int n = A.size();
        int val = 0;
        int repeatingNum = 0;
        int missingNum = 0;

        // To get xor of A[] and of numbers from 1 to n.
        // val - This will give us the xor of repeating and missing number
        for(int i = 0; i < n; i++) { // O(n)
            val = val ^ A.get(i) ^ (i+1);
        }

        // place - It will give us the place at which first one is placed in val
        int place = 0;
        while ((val & 1) != 1) { // O(1) max 32 times
            val = val >> 1;
            place++;
        }

        int val0 = 0,
            val1 = 0;

        for(int i = 0; i < n; i++) { // O(n)
            if((A.get(i) >> place & 1) == 1) {
                val1 ^= A.get(i);
            }
            else {
                val0 ^= A.get(i);
            }

            if(((i+1) >> place & 1) == 1) {
                val1 ^= (i+1);
            }
            else {
                val0 ^= (i+1);
            }
        }

        for(Integer ele : A) { // O(n)
            if(val0 == ele) {
                repeatingNum = val0;
            }
        }

        repeatingNum = repeatingNum == 0 ? val1 : val0;
        missingNum = repeatingNum == val1 ? val0 : val1;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(repeatingNum);
        arr.add(missingNum);

        return arr;
    }
    // TC - O(n) where n is the no. of array elements
    // SC - O(1)

    // Using maths
    private static ArrayList<Integer> repeatAndMissingNumberArray1(ArrayList<Integer> A) {

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
