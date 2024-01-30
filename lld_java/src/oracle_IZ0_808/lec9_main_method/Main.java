package oracle_IZ0_808.lec9_main_method;

public class Main {
    public static void main(String[] args) {
        System.out.println("args-size= " + args.length);

        for(int i = 0; i < args.length; i++) {
            System.out.println("arg["+ i +"]= " + args[i]);
        }
    }
}
