package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v4;

public class Client {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();

        studentBuilder.setfName("Ankur");
        studentBuilder.setlName("Gupta");
        studentBuilder.setAge(39);
        studentBuilder.setGender("male");
        studentBuilder.setPsp(100.00);
        studentBuilder.setBatch("Batch 3");

        Student student = new Student(studentBuilder);

        System.out.println(student.toString());
    }
}
