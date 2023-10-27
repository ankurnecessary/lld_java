package O5_Object_oriented_desing_and_analysis.O5_practice.exercise2_inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * super.getRadius() * this.height) + (2 * super.getArea());
    }

    @Override
    public String toString() {
        return "Cylinder: Subclass of " + super.toString() + " height=" + height;
    }
}
