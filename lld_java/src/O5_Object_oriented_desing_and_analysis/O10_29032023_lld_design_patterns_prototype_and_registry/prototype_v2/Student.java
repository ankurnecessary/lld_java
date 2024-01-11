package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v2;

/*
In the code below we are using copy constructor to create copies of the object.

Drawbacks:
1. It voilates the princple of SRP and OCP in client because we need to use if...else block to check the instance type
 */
public class Student {

    private String name;
    public int age;
    public String university;

    Student(){}

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.university = student.university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
