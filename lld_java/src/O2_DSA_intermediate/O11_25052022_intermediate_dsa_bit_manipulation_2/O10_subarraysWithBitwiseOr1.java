package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * >>Problem Description
 * Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.
 * Note : The answer can be large. So, return type must be long.
 *
 * >>Problem Constraints
 * 1 <= A <= 105
 *
 * >>Input Format
 * The first argument is a single integer A.
 * The second argument is an integer array B.
 *
 * >>Output Format
 * Return the number of subarrays with bitwise array 1.
 *
 * >>>>Example Input
 * >>Input 1:
 * A = 3
 * B = [1, 0, 1]
 * >>Input 2:
 * A = 2
 * B = [1, 0]
 *
 * >>>>Example Output
 * >>Output 1:
 * 5
 * >>Output2:
 * 2
 *
 * >>>>Example Explanation
 *
 * >>Explanation 1:
 * The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 *
 * >>Explanation 2:
 * The subarrays are :- [1], [0], [1, 0]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 */

public class O10_subarraysWithBitwiseOr1 {
    public static void main(String[] args) {
        int len = 3;
        Integer[] arr = {1, 0, 1};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(getNoOfSubarrays(len, arrList));
    }

    private static long getNoOfSubarrays(int len, ArrayList<Integer> arr) {
        Long ans = 0L;
        int zeroCount = 0;

        for(int i = 0; i < len; i++) { // TC - O(n)
            if(arr.get(i) == 1) {
                Long subArrLen = Long.valueOf(len-i);
                Long currSubArrayCount = subArrLen + (zeroCount * (subArrLen));
                ans += currSubArrayCount;
                zeroCount = 0;
            }
            else {
                zeroCount++;
            }
        }

        return ans;
    }
    // TC - O(n)
    // SC - O(1)
}
