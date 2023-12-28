package O2_DSA_intermediate.O15_01062022_intermediate_dsa_arrays_and_maths;

import java.util.ArrayList;

public class O5_findNthMagicNumber {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(findNthMagicNumber1(a));
        System.out.println(findNthMagicNumber2(a));
    }

    private static int findNthMagicNumber1(int A) {
        ArrayList<Integer> arr = new ArrayList();
        int powerOfFive = 5,
                powerDiff = 0,
                j=0;

        arr.add(powerOfFive);
        for(int i = 1; i < A; i++) {
            if(powerDiff == 0) {
                powerOfFive *= 5;
                powerDiff = i;
                arr.add(powerOfFive);
                j = 0;
            }
            else {
                arr.add(powerOfFive + arr.get(j));
                powerDiff--;
                j++;
            }
        }
        return arr.get(arr.size() - 1);
    }
    // TC - O(n)
    // SC - O(n)

    private static int findNthMagicNumber2(int A) {
        int answer = 0, powerOfFive = 5;
        while(A != 0) {
            if((A & 1) == 1) {
                answer += powerOfFive;
            }
            powerOfFive *= 5;
            A = A >> 1;
        }
        return answer;
    }
    // TC - O(1)
    // SC - O(1)
}
