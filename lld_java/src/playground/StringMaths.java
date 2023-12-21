package playground;

public class StringMaths {
    public static void main(String[] args) {

        System.out.println('A' - 'A');
        System.out.println("A".charAt(0));
        int num = '6' - '0';
        System.out.println(num);

        // Why in some question integer 48 is used instead of char '0'? Both the values are same
        int n = '0';
        System.out.println(n);
        System.out.println("Some: " + ('9' - '0'));
        System.out.println("Some: " + ('9' - 48));

    }
}
