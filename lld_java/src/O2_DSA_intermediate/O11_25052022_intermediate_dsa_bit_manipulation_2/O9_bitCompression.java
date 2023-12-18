package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * >>Problem Description
 * Richard Hendricks, a mastermind in compression algorithms, is an employee of Hooli in Silicon Valley.
 * One day, he finally decided to quit and work on his new idea of the middle-out compression algorithm.
 *
 * He needed to work at the bit - level to compress data. He, eventually, encountered this problem.
 * There is an array A of N integers. He has to perform certain operations on the elements.
 * In any one operation, two indices i and j (i < j) are chosen, and A[i] is replaced with A[i] & A[j],
 * and A[j] is replaced with A[i] | A[j], where & represents the Bitwise AND operation and | represents the Bitwise OR operation.
 * This operation is performed over all the pairs of integers in the array.
 *
 * Help Richard find the Bitwise XOR of all the elements after performing the operations.
 *
 * >>Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^9
 *
 * >>Input Format
 * The first argument is the integer array A.
 *
 * >>Output Format
 * Return a single integer denoting the XOR of the elements after performing the operations.
 *
 * >>>>Example Input
 *
 * >>Input 1:
 * A = [1, 3, 5]
 *
 * >>Input 2:
 * A = [1, 1, 1]
 *
 *
 * >>>>Example Output
 *
 * >>Output 1:
 * 7
 *
 * >>Output 2:
 * 1
 *
 * >>>>Example Explanation
 *
 * >>Explanation 1:
 * After performing the operations, the array becomes [1, 1, 7].
 * The XOR of all the elements of this array is 7.
 * There can be other possible arrays, but we can prove that the XOR will always be 7.
 *
 * >>Explanation 2:
 * Since all the elements are equal.
 * Even after applying the operations in any order, the array will be [1, 1, 1].
 * The XOR of all the elements of this array is 1.
 */

public class O9_bitCompression {
    public static void main(String[] args) {
        Integer[] arr = {1,3,5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(getBitCompression(arrayList));
    }

    private static int getBitCompression(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size(); i=i+2) { // TC - O(n/2)
            if(i+1 >= arr.size()) break;
            int val1 = arr.get(i) & arr.get(i+1);
            int val2 = arr.get(i) | arr.get(i+1);
            arr.set(i, val1);
            arr.set(i+1, val2);
        }

        int ans = arr.get(0);

        for(int i = 1; i < arr.size(); i++) { // TC - O(n)
            ans ^= arr.get(i);
        }

        return ans;
    }
    // TC - O(n)
    // SC - O(1)
}
