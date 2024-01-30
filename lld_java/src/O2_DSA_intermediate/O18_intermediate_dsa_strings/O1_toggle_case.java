package O2_DSA_intermediate.O18_intermediate_dsa_strings;

/*
* Question1: Give a char[] toggle the case of every character in the array.
*
* TC - O(n)
* SC - O(1)
* */

public class O1_toggle_case {
    public static void main(String[] args) {
        char[] arr = {'S', 'n', 'A', 'k', 'e'};
        System.out.println(toggleCase(arr));
    }

    private static char[] toggleCase(char[] arr) {

        int diff = 'a' - 'A';
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                // toggle to lower case
                arr[i] = (char)(arr[i] + diff);
            }
            else {
                // toggle to upper case
                arr[i] = (char)(arr[i] - diff);
            }

        }

        return arr;

    }
}
