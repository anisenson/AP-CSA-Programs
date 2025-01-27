public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(359);
        Circle c2 = new Circle(); // call default constructor
        System.out.println("c1 radius is: " + c1.getRadius());
        System.out.println("c2 radius is: " + c2.getRadius());
        c1.setRadius(20);
        System.out.println("c1 radius is now " + c1.getRadius());
        System.out.println("c1 area is: " + c1.getArea());
        System.out.println("c2 area is: " + c2.getArea());
    }
}