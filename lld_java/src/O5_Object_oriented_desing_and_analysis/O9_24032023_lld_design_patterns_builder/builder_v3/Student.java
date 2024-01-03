package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v3;

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

Builder v3 - In this version we replaced all the parameters of the constructors in V2 with a Map.
This is definitely an improvement but there are some shortcomings that still exist. There is a possibility of typos in keys of Map while writing the code.
Now any key can take any type of data in Map. That means following code will also pass the compile time check and will break during runtime.

builder.put("fName", 20);

A good codebase breaks at compile time not at runtime.
 */

import java.util.Map;

public class Student {
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private double psp;
    private String batch;

    public Student(Map<String, Object> builder) {

        if(builder.containsKey("fName")) {
            this.fName = (String) builder.get("fName");
        }

        if(builder.containsKey("lName")) {
            this.lName = (String) builder.get("lName");
        }

        if(builder.containsKey("age")) {
            this.age = (int) builder.get("age");
        }

        if(builder.containsKey("gender")) {
            this.gender = (String) builder.get("gender");
        }

        if(builder.containsKey("psp")) {
            this.psp = (double) builder.get("psp");
        }

        if(builder.containsKey("batch")) {
            this.batch = (String) builder.get("batch");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", psp=" + psp +
                ", batch='" + batch + '\'' +
                '}';
    }
}
