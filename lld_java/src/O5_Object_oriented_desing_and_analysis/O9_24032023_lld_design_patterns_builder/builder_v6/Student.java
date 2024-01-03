package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v6;

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

Builder v4 - This is another level of betterment in the code which addresses the issues that we had in v3.
By making a StudentBuilder class we made sure that all the field names of StudentBuilder class should match the field names of Student.
This will eradicate the chances of typos in the field names.
This will also make sure that a particular field will take only certain type of value and not any type of value, like in v3.
There is also one more issue with the current implementation. That is we cannot make out after looking at Student class that it has a builder pattern implemented
for it.
 */
public class Student {
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private double psp;
    private String batch;


    private Student(Builder builder) {
        this.fName = builder.getfName();
        this.lName = builder.getlName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
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

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String fName;
        private String lName;
        private int age;
        private String gender;
        private double psp;
        private String batch;

        public String getfName() {
            return fName;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
