package O5_Object_oriented_desing_and_analysis.O10_29032023_lld_design_patterns_prototype_and_registry.prototype_v4;

/*
Final version
-------------
Now we have implemented the prototype pattern with the help of clone and copy constructor.
*/
public class IntelligentStudent extends Student {

    public double psp;
    public int iq;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent target) {
        super(target);
        if(target != null) {
            this.psp = target.psp;
            this.iq = target.iq;
        }
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
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
