package O5_Object_oriented_desing_and_analysis.O3_04032023_lld_oop3_inheritance_and_polymorphism.copy_constructor;

public class Main {
    public static void main(String [] args) {
        Student st = new Student("male");
        st.name = "Ankur";
        st.age = 40;

        Student st1 = new Student(st);
        System.out.println("name: " + st1.name + ", age: " + st1.age);
    }
}
