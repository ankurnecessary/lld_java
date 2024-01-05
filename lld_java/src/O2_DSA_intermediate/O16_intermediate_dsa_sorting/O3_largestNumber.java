package O2_DSA_intermediate.O16_intermediate_dsa_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
>>Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.

>>Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109

>>Input Format
The first argument is an array of integers.

>>Output Format
Return a string representing the largest number.

>>>>Example Input
>>Input 1:
 A = [3, 30, 34, 5, 9]
>>Input 2:
 A = [2, 3, 9, 0]

>>>>Example Output
>>Output 1:
 "9534330"
>>Output 2:
 "9320"

>>>>Example Explanation
>>Explanation 1:
Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
>>Explanation 2:
Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.

 */

public class O3_largestNumber {
    public static void main(String[] args) {
        Integer[] arr = {3, 30, 34, 5, 9};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(getLargestNumber(arrList));
    }

    private static String getLargestNumber(ArrayList<Integer> arr) {
        String ans = "";

        // Sorting the array so that we can form a largest number after combining all the integers in it
        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                String aStr = a + "";
                String bStr = b + "";
                return (bStr + aStr).compareTo(aStr + bStr);
            }
        });

        System.out.println(arr);
        if (arr.get(0) == 0) return "0";

        for (int num : arr) {
            ans += num;
        }

        return ans;
    }
}
