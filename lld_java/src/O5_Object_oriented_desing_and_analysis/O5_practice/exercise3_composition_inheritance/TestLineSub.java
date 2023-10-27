package O5_Object_oriented_desing_and_analysis.O5_practice.exercise3_composition_inheritance;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        l1.setXY(109, 233);
        l1.end.setXY(100, 101);
        System.out.println(l1);

        Point p1 = new Point(4,65);
        Point p2 = new Point(34, 67);

        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
    }
}
