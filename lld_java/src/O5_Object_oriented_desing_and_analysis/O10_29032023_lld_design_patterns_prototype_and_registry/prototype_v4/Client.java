package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v4;

public class Client {
    public static void main(String[] args) {
        IntelligentStudent student3 = new IntelligentStudent();
        student3.setName("Akshay");
        student3.age = 34;
        student3.university = "DU";
        student3.psp = 80.9;
        student3.iq = 9;
        IntelligentStudent student4 = student3.clone();
        System.out.println(student4.toString());
    }
}
