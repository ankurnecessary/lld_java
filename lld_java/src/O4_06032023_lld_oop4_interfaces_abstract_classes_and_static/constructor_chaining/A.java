package O4_06032023_lld_oop4_interfaces_abstract_classes_and_static.constructor_chaining;

public class A {

    private int i = 10;

    A() {
        System.out.println("Constructor of A");
    }

    void getI () {
        System.out.println(i);
    }

    void setI (int i) {
        this.i = i;
    }
}
