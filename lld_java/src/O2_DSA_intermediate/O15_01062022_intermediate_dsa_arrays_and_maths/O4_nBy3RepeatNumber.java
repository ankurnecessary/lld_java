package O2_DSA_intermediate.O15_01062022_intermediate_dsa_arrays_and_maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * >>Problem Description
 * You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1.
 *
 * If there are multiple solutions, return any one.
 *
 * Note: Read-only array means that the input array should not be modified in the process of solving the problem
 *
 * >>Problem Constraints
 * 1 <= N <= 7*105
 * 1 <= A[i] <= 109
 *
 * >>Input Format
 * The only argument is an integer array A.
 *
 * >>Output Format
 * Return an integer.
 *
 * >>>>Example Input
 * >>Input 1:
 * [1 2 3 1 1]
 * >>Input 2:
 * [1 2 3]
 *
 * >>>>Example Output
 * >>Output 1:
 * 1
 * >>Output 2:
 * -1
 *
 * >>>>Example Explanation
 * >>Explanation 1:
 * 1 occurs 3 times which is more than 5/3 times.
 * >>Explanation 2:
 * No element occurs more than 3 / 3 = 1 times in the array.
 */

public class O4_nBy3RepeatNumber {

    public static void main(String[] args) {
        Integer[] arr = {1,2,2,1,2,1,5,6,1,2};
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(getNBy3RepeatNumber(arrList));
    }

    private static int getNBy3RepeatNumber(final List<Integer> arr) {
        int e1 = 0, e2 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == e1) {
                count1++;
            }
            else if(arr.get(i) == e2) {
                count2++;
            }
            else if(count1 == 0 || count2 == 0) {
                if(count1 == 0) {
                    e1 = arr.get(i);
                    count1++;
                }
                else {
                    e2 = arr.get(i);
                    count2++;
                }
            }
            else{
                count1--;
                count2--;
                if(count1 == 0) e1 = 0;
                if(count2 == 0) e2 = 0;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == e1) count1++;
            if(arr.get(i) == e2) count2++;
        }

        if(count1 > (arr.size() / 3)) return e1;
        if(count2 > (arr.size() / 3)) return e2;

        return -1;
    }

}
