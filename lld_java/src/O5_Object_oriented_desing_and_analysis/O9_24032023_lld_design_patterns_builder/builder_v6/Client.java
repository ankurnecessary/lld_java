package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v6;


public class Client {
    public static void main(String[] args) {
        Student student = Student.createBuilder()
                .setfName("Ankur")
                .setlName("Gupta")
                .setAge(39)
                .setGender("male")
                .setPsp(100.00)
                .setBatch("Batch 5")
                .build();

        System.out.println(student.toString());
    }
}
