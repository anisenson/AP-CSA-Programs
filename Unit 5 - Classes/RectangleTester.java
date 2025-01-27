public class RectangleTester {
    public static void main(String[] args) {
    // Create two instances of a Rectangle
    Rectangle r1 = new Rectangle("orange", 10, 3);
    // call methods on the two instances
    // and print out what is returned from those
    // method calls
    String c = r1.getColor();
    System.out.println("r1 color is: " + c);
    System.out.println("r1 length is: " + r1.getLength());
    }
}