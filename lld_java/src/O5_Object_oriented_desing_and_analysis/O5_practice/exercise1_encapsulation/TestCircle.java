package O5_Object_oriented_desing_and_analysis.O5_practice.exercise1_encapsulation;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3.0, "Yellow");
        System.out.println("This circle has radius of " + c3.getRadius() + ", area of " + c3.getArea() + " and it's color is " + c3.getColor() +".");
        c3.setRadius(5.0);
        c3.setColor("Green");
        System.out.println(c3);
        System.out.println(c3.toString());
    }
}
