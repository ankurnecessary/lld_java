package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v3;

public class IntelligentStudent extends Student {

    public double psp;
    public int iq;

    public IntelligentStudent clone() {
        IntelligentStudent copy = new IntelligentStudent();
        copy.setName(this.getName());
        copy.age = this.age;
        copy.university = this.university;
        copy.psp = this.psp;
        copy.iq = this.iq;
        return copy;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "psp=" + psp +
                ", iq=" + iq +
                ", name=" + this.getName() +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
