package O2_DSA_intermediate.O16_intermediate_dsa_sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class O1_bubbleSorting {
    public static void main(String[] args) {
        Integer[] arr = {3,1,5,4,2};
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(bubbleSort(arrList));
    }

    private static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {

        int n = arr.size();

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
