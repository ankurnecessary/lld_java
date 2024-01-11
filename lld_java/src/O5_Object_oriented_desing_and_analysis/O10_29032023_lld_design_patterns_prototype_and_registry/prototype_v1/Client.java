package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v1;

/*
Version 1 - Basic way of defining a class to create an object. Whenever we need to create an object of this class, we
will call new Student() and then assign new values to its fields.

Drawbacks
1. Client stay tightly coupled with the Student concrete class implementation.
2. How to copy private attributes in this way?
3. Problem with copying child classes
4. If else block in client.java voilates SRP and OCP.
*/
public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ankur";
        student1.age = 39;
        student1.university = "GGSIP";

        // Now when we want to create a duplicate of the same object, this is what we will do
        Student student2 = new Student();
        student2.name = student1.name;
        student2.age = student1.age;
        student2.university = student1.university;

        System.out.println(student2.toString());

        /// Creating intelligent student (A child class)
        // Setting each attribute is a tight coupling
        // If, any new attribute is added then it has to be set it in the if else block below
        IntelligentStudent student3 = new IntelligentStudent();
        if (student1 instanceof IntelligentStudent) { // This is tight coupling
            student3.name = student1.name;
            student3.age = student1.age;
            student3.university = student1.university;
            student3.psp = ((IntelligentStudent) student1).psp;
            student3.iq = ((IntelligentStudent) student1).iq;
        } else if (student3 instanceof Student) { // This is tight coupling
            student3.name = student1.name;
            student3.age = student1.age;
            student3.university = student1.university;
        }


    }
}
