package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v3;

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
