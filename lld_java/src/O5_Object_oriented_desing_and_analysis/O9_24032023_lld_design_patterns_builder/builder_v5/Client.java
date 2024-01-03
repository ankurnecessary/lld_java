package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v5;

public class Client {
    public static void main(String[] args) {
        Student.Builder studentBuilder = Student.createBuilder();
        studentBuilder.setfName("Ankur");
        studentBuilder.setlName("Gupta");
        studentBuilder.setAge(39);
        studentBuilder.setGender("male");
        studentBuilder.setPsp(100.00);
        studentBuilder.setBatch("Batch 4");

        Student student = studentBuilder.build();

        System.out.println(student.toString());
    }
}
