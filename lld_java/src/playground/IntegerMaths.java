package playground;

import java.util.ArrayList;

public class IntegerMaths {
    public static void main(String[] args) {
        // Converting Integer type to type long
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        long b = (long)arr.get(0); // This is how we convert an Integer type to type long
        long c = 1l * arr.get(0); // This is how we convert an Integer type to type long
        System.out.println(b);
        System.out.println(c);

    }
}
