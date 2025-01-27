public class Circle {
    private double radius; // instance data

    public Circle() { // default constructor
        radius = 10;
    }

    public Circle(double rad) { // another constructor
        radius = rad;
    }

    public double getRadius() { // accessor or getter method
        return radius;
    }

    public void setRadius(double r) { // mutator method
        radius = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}