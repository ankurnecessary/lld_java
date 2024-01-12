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
public class Student {
    private String name;
    public int age;
    public String university;

    public Student clone () {
        Student copy = new Student();
        copy.name = this.name;
        copy.age = this.age;
        copy.university = this.university;
        return copy;
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
