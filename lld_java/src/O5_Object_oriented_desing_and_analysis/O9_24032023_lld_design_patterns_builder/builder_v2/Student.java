package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v2;

/*
Builder v1 - In the code below we created all private fields and also created their getter and setters because of which the class became quite bulky.
Also, client of this class has to create its object via default constructor of Student class and used setter of each field to assign a property to it.
Setting fields in this way will again lead to a lot of code to be written.
This approach will not work in the cases where we want to make immutable objects of the class because of presence of setters in it.
 THIS IS NOT A GOOD APPROACH.

Builder v2 - In the code below we created a constructor to set all the fields.
It may not currently appear concernful but if we have much more field to set then the number of parameters in the constructor will increase.
In the client of such a class when we create an object of Student class then it will become difficult to comperhend the values passed as the argument to the constructor
of Student class. Like below

Student student = new Student("Ankur", "Gupta", 39, "male", 100, "Batch1",....);
 THIS IS NOT A GOOD APPROACH.
 */
public class Student {
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private double psp;
    private String batch;

    public Student(String fName, String lName, int age, String gender, double psp, String batch) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.psp = psp;
        this.batch = batch;
    }
}
