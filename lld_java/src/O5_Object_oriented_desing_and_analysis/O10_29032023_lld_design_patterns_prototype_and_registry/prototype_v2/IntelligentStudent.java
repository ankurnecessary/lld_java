package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v2;

/*
In the code below we are using copy constructor to create copies of the object.

Drawbacks:
1. It voilates the princple of SRP and OCP in client because we need to use if...else block to check the instance type
 */
public class IntelligentStudent extends Student {
    public double psp;
    public int iq;

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent target) {
        super(target);
        if(target != null) {
            this.psp = target.psp;
            this.iq = target.iq;
        }
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "psp=" + psp +
                ", iq=" + iq +
                ", age=" + age +
                ", name=" + this.getName() +
                ", university='" + university + '\'' +
                '}';
    }
}
