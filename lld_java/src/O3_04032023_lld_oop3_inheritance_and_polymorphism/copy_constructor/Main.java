package O3_04032023_lld_oop3_inheritance_and_polymorphism.copy_constructor;

public class Main {
    public static void main(String [] args) {
        Student st = new Student();
        st.name = "Ankur";
        st.gender = "male";
        st.age = 40;

        Student st1 = new Student(st);
        System.out.println("name: " + st1.name + ", gender: " + st1.gender + ", age: " + st1.age);
    }
}
