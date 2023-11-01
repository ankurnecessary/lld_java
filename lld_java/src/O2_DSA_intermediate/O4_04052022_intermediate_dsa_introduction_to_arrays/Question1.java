package O2_DSA_intermediate.O4_04052022_intermediate_dsa_introduction_to_arrays;

import java.util.Arrays;

/*Question - Given an array of N elements. Count the no. of elements having
at least 1 element greater than itself in the array.*/
public class Question1 {
    // Approach 1 TC - O(n^2)
    private static int noOfElements1(int[] arr) {

        int count = 0;

        for(int ele1: arr) {
            for(int ele2: arr) {
                if(ele2 > ele1) {
                     count++;
                    break;
                }
            }
        }

        return count;

    }

    // Approach 2 TC - O(n log n)
    private static int noOfElements2(int[] arr) {
        int count = 1;

        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        int n = arr.length;
        int largestElement = arr[n-1];
        for(int i = n-2; i > 0; i--) {
            if(arr[i] == largestElement) {
                count++;
            }
        }

        return n-count;
    }

    // Approach 3 - By going through the above approaches we found that if we find the largest element
    // and then finding the no. of it's occurrences will help us. TC - O(n)
    private static int noOfElements3(int[] arr) {

        int largestNum = Integer.MIN_VALUE;
        for(int ele: arr) {
            largestNum = Math.max(largestNum, ele);
        }

        int count = 0;
        for(int ele: arr) {
            if(ele == largestNum) {
                count++;
            }
        }

        int n = arr.length;
        return n - count;

    }

    public static void main(String[] args) {
        int[] arr = {-3, 2, 9, 5, 8, 10, 6, 7, 4, 10, 10, -2};
        // System.out.println(noOfElements1(arr));
        // System.out.println(noOfElements2(arr));
        System.out.println(noOfElements3(arr));
    }

}
