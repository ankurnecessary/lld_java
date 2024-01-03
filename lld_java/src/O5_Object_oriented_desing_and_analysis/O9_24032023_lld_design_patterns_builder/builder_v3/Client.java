package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v3;

import O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v3.Student;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<String, Object> builder = new HashMap<>();
        builder.put("fName", "Ankur");
        builder.put("lName", "Gupta");
        builder.put("age", 39);
        builder.put("gender", "male");
        builder.put("batch", "Batch2");

        Student student = new Student(builder);

        System.out.println(student.toString());
    }
}
