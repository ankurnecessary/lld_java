package O2_DSA_intermediate.O4_04052022_intermediate_dsa_introduction_to_arrays;

import java.util.Arrays;

public class PairSum {
    /* Given an array of integers. Find the pair of array elements which is equal to the sum provided */

    // Approach 1 - TC: O(n^2) - We will check every element in combination of every other element
    // of the array. This will take nested for loops. Hence, TC is O(n^2)

    // Approach 2 - TC: O(n)
    private static int[] getPairSum (int[] arr, int sum){
        int[] ansArr = new int[2];
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if(arr[start] + arr[end] == sum) {
                ansArr[0] = arr[start];
                ansArr[1] = arr[end];
                break;
            }
            else if (arr[start] + arr[end] > sum) {
                end--;
            }
            else {
                start++;
            }
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,10,12,15};
        System.out.println(Arrays.toString(getPairSum(arr, 8)));
    }

}
