package O2_DSA_intermediate.O4_04052022_intermediate_dsa_introduction_to_arrays;

import java.util.Scanner;

/*
Rotation Game - Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.

Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109

Input Format
There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.

Line 2: A single integer B.

Output Format
Print array A after rotating it B times towards the right.

Example Explanation
Example 1 :

N = 4, A = [1, 2, 3, 4] and B = 2.

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]

Final array = [3, 4, 1, 2]

Approach 1
----------
TC - O(B * N)
SC - O(1)
Iterate B times
Each time of B:
Put the last element of the array A in a variable num.
Push all the values an index ahead. Means push index 1’s element to 2nd index, 2nd to 3rd and so on.
In the end  put the value of num at A[0].

Approach 2
-----------
TC - O(N)
SC - O(1)
Rotate the whole array A.
Now rotate the first B elements of the array A.
Now rotate the rest of the elements of the array A, lying after the first B elements.

*/

public class RotationGame {
    // TC: O(n)
    // SC: O(1)
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt() % n;

        // Reversing whole array
        for(int i = 0; i < n/2; i++) {
            int num = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = num;
        }

        // Reversing first b elements of array a
        for(int i = 0; i < b/2; i++) {
            int num = a[i];
            a[i] = a[b-1-i];
            a[b-1-i] = num;
        }

        // Reversing rest of the elements of array a
        int j = 0;
        for(int i = b; i <= (n - 1 + b) / 2; i++) {
            int num = a[i];
            a[i] = a[n-1-j];
            a[n-1-j] = num;
            j++;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
