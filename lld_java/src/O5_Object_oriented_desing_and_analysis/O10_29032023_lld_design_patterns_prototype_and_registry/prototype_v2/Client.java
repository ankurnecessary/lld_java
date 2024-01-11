package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v2;

/*
In the code below we are using copy constructor to create copies of the object.

Drawbacks:
1. It voilates the princple of SRP and OCP in client because we need to use if...else block to check the instance type
 */
public class Client {
    public static void main(String[] args) {
        /*Student student1 = new Student();
        student1.setName("Ankur Gupta");
        student1.age = 39;
        student1.university = "GGSIP";*/

        IntelligentStudent student1 = new IntelligentStudent();
        student1.setName("Ankur Gupta");
        student1.age = 39;
        student1.university = "GGSIP";
        student1.psp = 80.33;
        student1.iq = 9;

        if (student1 instanceof IntelligentStudent) { // Here SRP and OCP are voilated
            Student student2 = new IntelligentStudent((IntelligentStudent) student1);
            System.out.println(student2.toString());
        } else if (student1 instanceof Student) {
            Student student2 = new Student(student1);
            System.out.println(student2.toString());
        }

    }
}
