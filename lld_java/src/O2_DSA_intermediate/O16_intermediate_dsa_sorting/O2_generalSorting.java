package O2_DSA_intermediate.O16_intermediate_dsa_sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
Lembda functions help in defining the simple expressions of sorting but if we want to define
complex algorithm for sorting then we have to go with the object of comparator classes.
Refer "3. Sorting an array of Objects using a Comparator" @ https://www.codejava.net/java-core/collections/sorting-arrays-examples-with-comparable-and-comparator
 */
public class O2_generalSorting {
    public static void main(String[] args) {

        int[][] coordinates = {{1,2}, {3,4}, {0,2}, {1,4}};

        // Sorting on the basis of y-axis
        Arrays.sort(coordinates, (int[] o1, int[] o2) -> (o1[1] - o2[1]));
        System.out.println(Arrays.deepToString(coordinates));

        // Shortened the above sorting expression further
        Arrays.sort(coordinates, Comparator.comparingInt((int[] o) -> o[1]));
        System.out.println(Arrays.deepToString(coordinates));

        // Sorting on the basis of distance from {0,0}
        Arrays.sort(coordinates, (int[] o1, int[] o2) -> (((o1[0] * o1[0]) + (o1[1] * o1[1])) - ((o2[0] * o2[0]) + (o2[1] * o2[1]))));
        System.out.println(Arrays.deepToString(coordinates));

        // Sorting on the basis of distance from {0,0} - There is one more way of writing the comparator
        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return ((o1[0] * o1[0]) + (o1[1] * o1[1])) - ((o2[0] * o2[0]) + (o2[1] * o2[1]));
            }
        });
        System.out.println(Arrays.deepToString(coordinates));

    }
}
