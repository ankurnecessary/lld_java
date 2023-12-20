package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;


/**
 * >>Problem Description
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 *
 * >>Problem Constraints
 * 1 <= length of the column title <= 5
 *
 * >>Input Format
 * The only argument is a string that represents the column title in the excel sheet.
 *
 * >>Output Format
 * Return a single integer that represents the corresponding column number.
 *
 * >>>>Example Input
 * >>Input 1:
 *  AB
 * >>Input 2:
 *  BB
 *
 * >>>>Example Output
 * >>Output 1:
 *  28
 * >>Output 2:
 *  54
 *
 * >>>>Example Explanation
 * >>Explanation 1:
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
 *
 * >>Explanation 2:
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
 *  ...
 *  AZ -> 52
 *  BA -> 53
 *  BB -> 54
 */

public class O2_excelColNo {
    public static void main(String[] args) {
        String column = "ABA";
        System.out.println(excelColNo(column));
    }

    private static int excelColNo(String column) {

        int answer = 0, power = 1;
        for(int i = column.length() - 1; i >= 0; i--) {
            answer = answer + (power * (column.charAt(i) - 'A' + 1));
            power *= 26;
        }
        return answer;

    }
    // TC - O(n) where n is the length of the string column
    // SC - O(1)
}
