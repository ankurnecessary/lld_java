package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v1;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.setfName("Ankur");
        student.setlName("Gupta");
        student.setAge(39);
        student.setGender("male");
        student.setPsp(100);
        student.setBatch("Batch1");
        System.out.println(student.toString());
    }
}
