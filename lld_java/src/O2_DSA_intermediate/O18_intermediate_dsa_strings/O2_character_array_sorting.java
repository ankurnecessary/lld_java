package O2_DSA_intermediate.O18_intermediate_dsa_strings;


/*
Question2: Given a char[] which contains only lowercase letters. Sort the given char[].
The algorithm that we used here is COUNT SORT

TC - O(n + range of lowercase alphabets i.e. 26)
SC - O(1)
 */
public class O2_character_array_sorting {

    public static void main(String[] args) {
        char[] arr = {'b','a','t','m','a','n'};
        System.out.println(sortCharArr(arr));
    }

    private static char[] sortCharArr(char[] arr) {

        int[] charMap= new int[26];

        for(char charItem: arr) {
            charMap[charItem - 'a'] += 1;
        }

        int idx = 0;
        for(int i = 0; i < charMap.length; i++) {
            char currentChar = (char)('a' + i);
            int charCount = charMap[i];

            while (charCount > 0) {
                arr[idx] = currentChar;
                idx++;
                charCount--;
            }
        }

        return arr;

    }
}
