package oracle_IZ0_808.lec11_packages_and_imports;

import oracle_IZ0_808.lec11_packages_and_imports.a.b.c.d.ExampleClass;
import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));
        ExampleClass e = new ExampleClass();
    }
}
