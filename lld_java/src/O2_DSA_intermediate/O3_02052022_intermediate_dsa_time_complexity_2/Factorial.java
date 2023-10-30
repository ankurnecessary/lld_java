package O2_DSA_intermediate.O3_02052022_intermediate_dsa_time_complexity_2;

public class Factorial {
    private static int getFactorial(int n) {
        // base case
        if(n == 0) {
            return 1;
        }

        // recursive case
        return n * getFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
