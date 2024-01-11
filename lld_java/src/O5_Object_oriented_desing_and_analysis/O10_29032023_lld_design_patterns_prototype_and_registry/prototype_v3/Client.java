package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v3;
/*
We are going to use only clone method to create the copy of an object of the same class.
If clone method is there in the parent class then it should be there in all child classes.
		Student s = new IntelligentStudent();

1. Here also we will find the issue in setting the private attributes of the parent class via child's clone
method.

We can set it by using setter and getter on the private attributes in the parent class i.e. Student.
But we have more elegant solution to it in the next version where we will use both clone method and copy
constructor.
 */
public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ankur");
        student1.age = 39;
        student1.university = "GGSIP";

        Student student2 = student1.clone();
        System.out.println(student2.toString());

        Student student3 = new IntelligentStudent();
        student3.setName("Ajay");
        student3.age = 35;
        student3.university = "DU";
        ((IntelligentStudent)student3).psp = 80.99;
        ((IntelligentStudent)student3).iq = 8;

        IntelligentStudent student4 = ((IntelligentStudent)student3).clone();
        System.out.println(student4.toString());
    }
}
