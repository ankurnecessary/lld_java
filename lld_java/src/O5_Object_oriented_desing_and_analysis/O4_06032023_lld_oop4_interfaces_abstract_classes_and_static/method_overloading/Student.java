package O5_Object_oriented_desing_and_analysis.O4_06032023_lld_oop4_interfaces_abstract_classes_and_static.method_overloading;

import java.util.List;

public class Student {
    void test1 (List<String> strArr) {
        System.out.println(strArr);
    }

    void test(List<Integer> intArr) {
        System.out.println(intArr);
    }
}
