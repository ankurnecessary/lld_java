package O2_DSA_intermediate.O15_01062022_intermediate_dsa_arrays_and_maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * >>Problem Description
 * Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exists in the array.
 *
 * >>Problem Constraints
 * 1 <= N <= 5*105
 * 1 <= num[i] <= 109
 *
 * >>Input Format
 * Only argument is an integer array.
 *
 * >>Output Format
 * Return an integer.
 *
 * >>>>Example Input
 * >>Input 1:
 * [2, 1, 2]
 * >>Input 2:
 * [1, 1, 1]
 *
 * >>>>Example Output
 * >>Input 1:
 * 2
 * >>Input 2:
 * 1
 *
 * >>>>Example Explanation
 * >>For Input 1:
 * 2 occurs 2 times which is greater than 3/2.
 * >>For Input 2:
 *  1 is the only element in the array, so it is majority
 */

public class O1_majorityElement {
    public static void main(String[] args) {
        Integer[] arr = {1,2,1,1,1,3,4,5,1};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(getMajorityElement(arrList));
    }

    private static int getMajorityElement(final List<Integer> arr) {
        int ele = arr.get(0);
        int count = 1;

        for(int i = 1; i < arr.size(); i++) {
            if(count == 0) {
                ele = arr.get(i);
                count++;
            }
            else if(ele == arr.get(i)) {
                count++;
            }
            else {
                count--;
                if(count == 0) {
                    ele = 0;
                }
            }
        }

        return ele;
    }
    // tc - O(n)
    // sc - O(1)
}
