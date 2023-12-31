package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * >>Problem Description
 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
 * Find the two integers that appear only once.
 *
 * Note: Return the two numbers in ascending order.
 *
 * >>Problem Constraints
 * 2 <= |A| <= 100000
 * 1 <= A[i] <= 10^9
 *
 * >>Input Format
 * The first argument is an array of integers of size N.
 *
 * >>Output Format
 * Return an array of two integers that appear only once.
 *
 * >>>>Example Input
 * >>Input 1:
 * A = [1, 2, 3, 1, 2, 4]
 * >>Input 2:
 * A = [1, 2]
 *
 * >>>>Example Output
 * >>Output 1:
 * [3, 4]
 * >>Output 2:
 * [1, 2]
 *
 * >>>>Example Explanation
 * >>Explanation 1:
 * 3 and 4 appear only once.
 * >>Explanation 2:
 * 1 and 2 appear only once.
 *
 */

public class O8_singleNumber3 {

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 1, 2, 4};
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(nums));
        System.out.println(getSingleNo(numsList));
    }

    private static ArrayList<Integer> getSingleNo(ArrayList<Integer> nums) {
        ArrayList<Integer> ansArr = new ArrayList(2);

        // Calculating xor of the array elements
        int xorNum = nums.get(0);
        for(int i = 1; i < nums.size(); i++) { // TC - O(n)
            xorNum ^= nums.get(i);
        }

        // Finding the location index of first set bit(1) in xorNum
        int bitIndex = -1;
        while(xorNum > 0) {
            bitIndex++;
            if( (xorNum & 1) == 1 ) break;
            xorNum = xorNum >> 1;
        }

        // Figuring out 2 non repeating numbers via xor'ing after separating
        // them on the basis of 0 and 1 on the location bitIndex
        int num0 = 0;
        int num1 = 0;
        for (Integer num : nums) {
            if ((num & (1 << bitIndex)) != 0) {
                num0 ^= num;
            } else {
                num1 ^= num;
            }
        }

        // setting num0 and num1 in ansArr
        ansArr.add(Math.min(num0, num1));
        ansArr.add(Math.max(num0, num1));

        return ansArr;
    }
    // TC - O(n)
    // SC - O(1)
}
