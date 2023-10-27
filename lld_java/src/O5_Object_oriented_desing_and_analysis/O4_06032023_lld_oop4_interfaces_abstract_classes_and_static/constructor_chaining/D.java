package O5_Object_oriented_desing_and_analysis.O4_06032023_lld_oop4_interfaces_abstract_classes_and_static.constructor_chaining;

public class D extends C{
    D() {
        // We used super call because C's constructor has parameters in it's constructor
        super("Ankur", "test@test.com");
        System.out.println("Constructor of D");

        this.setI(11);

        this.getI();

    }
}
