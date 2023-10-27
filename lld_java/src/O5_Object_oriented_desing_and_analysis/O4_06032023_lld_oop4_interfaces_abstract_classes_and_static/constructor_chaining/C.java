package O5_Object_oriented_desing_and_analysis.O4_06032023_lld_oop4_interfaces_abstract_classes_and_static.constructor_chaining;

public class C extends B{
    C() {
        System.out.println("Constructor of C");
    }
    C(String name, String email) {
        System.out.println("Constructor of C with name: " + name + " and email: " + email );
    }
}
