package O5_practice.exercise3_composition_inheritance;

public class TestLine {
    public static void main(String[] args){
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(4,65);
        Point p2 = new Point(34, 67);

        Line l2 = new Line(p1, p2);
        System.out.println(l2);
    }
}
