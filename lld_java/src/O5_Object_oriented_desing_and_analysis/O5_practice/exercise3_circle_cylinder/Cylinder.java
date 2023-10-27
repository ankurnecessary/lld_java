package O5_Object_oriented_desing_and_analysis.O5_practice.exercise3_circle_cylinder;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getSurfaceArea() {
        return (2 * Math.PI * base.getRadius() * height) + (2 * base.getArea());
    }

    public String toString() {
        return "Cylinder: Subclass of " + base.toString() + " height=" + height;
    }

    public double getRadius() {
        return base.getRadius();
    }

}
