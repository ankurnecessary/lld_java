package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v4;

/*
Final version
-------------
Now we have implemented the prototype pattern with the help of clone and copy constructor.
*/
public abstract class Student {

    private String name;
    public int age;
    public String university;

    public Student() {
    }

    public Student(Student target) {
        if(target != null) {
            this.name = target.name;
            this.age = target.age;
            this.university = target.university;
        }
    }

    public abstract Student clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
