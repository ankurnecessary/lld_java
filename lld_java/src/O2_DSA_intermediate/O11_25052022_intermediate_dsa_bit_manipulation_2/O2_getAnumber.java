package O2_DSA_intermediate.O11_25052022_intermediate_dsa_bit_manipulation_2;

/*
* Generate a number in which only bits at location (0 based index from right) x and y are set.
 * */
public class O2_getAnumber {
    public static void main(String[] args) {
        System.out.println(getANumber(1,3));
    }

    static int getANumber(int x, int y) {
        // int firstNum = 1 << x;
        // int secondNum = 1 << y;
        // System.out.println("firstNum: " + firstNum);
        // System.out.println("secondNum: " + secondNum);
        // return firstNum + secondNum;
        return (1<<x) | (1<<y);
    }
}
