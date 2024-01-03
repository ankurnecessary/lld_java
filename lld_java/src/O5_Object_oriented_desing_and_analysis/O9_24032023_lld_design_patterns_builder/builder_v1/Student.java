package O5_Object_oriented_desing_and_analysis.O9_24032023_lld_design_patterns_builder.builder_v1;

/*

Builder pattern is used in the scenarios where we have many fields in a class.

Builder v1 - In the code above we created all private fields and also created their getter and setters because of which the class became quite bulky.
Also, client of this class has to create its object via default constructor of Student class and used setter of each field to assign a property to it.
Setting fields in this way will again lead to a lot of code to be written. THIS IS NOT A GOOD APPROACH.
This approach will not work in the cases where we want to make immutable objects of the class because of presence of setters in it.
 */
public class Student {
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private double psp;
    private String batch;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
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
