package O2_DSA_intermediate.O14_30052022_intermediate_dsa_maths_modular_arithmetic_introduction;

/**
 * Question 1: Given a and n, find a^n.
 * https://docs.google.com/document/d/1f_-9srjE_w-n-KoO3dyZn144U5tdy6rEP_LJ5CURCzA/edit#heading=h.f7wwmqae0xwe
 */
public class O1_powerNOfANumber {

    public static void main(String[] args) {
        int num = 5, power = 7;
        System.out.println(getPowerNOfANumber(num, power));
    }

    private static int getPowerNOfANumber(int num, int power) {
        int ans = 1;
        int multiplier = num;
        while(power > 0) {
            if((power & 1) == 1) {
                ans = ans * multiplier;
            }
            multiplier *= multiplier;
            power = power >> 1;
        }
        return ans;
    }
    // num = 3, power = 13 -> 3 ^ 1101 -> [3^1] * [3^4] * [3^8]
    // num = 2, power = 7 -> 2 ^ 111 -> [2^1] * [2^2] * [2^4]
    // num = 5, power = 7 -> 5 ^ 111 -> [5^1] * [5^2] * [5^4]
    // TC - O(log n)
    // SC - O(1)

}
