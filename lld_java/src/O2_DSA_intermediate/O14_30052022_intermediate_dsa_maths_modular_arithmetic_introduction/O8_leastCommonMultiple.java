package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;

import java.util.Scanner;

/**
 * Problem Description
 *
 * Write a program to input an integer T and then for each test case input two integers A and B in two different lines and then print T lines containing Least Common Multiple (LCM) of two given 2 numbers A and B.
 *
 * Note: LCM of two integers is the smallest positive integer divisible by both.
 *
 *
 * Problem Constraints
 * 1 <= T <= 1000
 * 1 <= A,B <= 1000
 *
 * Input Format
 * The first line contains T which means number of test cases.
 * Next 2T lines contains input A and B for each testcase.
 * First line of each testcase contain an integer A and second line of the testcase contains input B.
 *
 * Output Format
 * T lines each containing an integer representing LCM of A & B.
 *
 * Example Input
 * Input 1:
 * 3
 * 2
 * 3
 * 9
 * 6
 * 2
 * 6
 *
 *
 * Example Output
 * Output 1:
 * 6
 * 18
 * 6
 *
 * Example Explanation
 * Explanation:
 *  In first testcase 6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
 *  In second testcase 18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
 *  In third testcase  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
 */

public class O8_leastCommonMultiple {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 0) { // O(n)
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println((a*b) / gcd(a,b));
            n--;
        }

    }
    // tc - O( n log to the base phie (min(a,b)) )

    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // tc - O( log to the base phie (min(a,b)) )
    // sc - O(1)
}
