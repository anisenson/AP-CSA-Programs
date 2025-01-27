public class LineSegmentTester {
    public static void main(String[] args){
        Point p1 = new Point(3, 10);
        Point p2 = new Point(-4, 7);
        Point p3 = new Point(5,2);
        Point p4 = new Point(20, 20);

        LineSegment seg1 = new LineSegment(p1, p2, "M", "K");
        LineSegment seg2 = new LineSegment(p3, p4);

        LineSegment seg3 = new LineSegment( new Point(-7, -8), new Point (2,2), "R", "S");

        System.out.println("Segment 3 is: " + seg3);
        System.out.println("Segment 2 is: " + seg2);
        System.out.println("Segment 1 is: " + seg1);


        double len = seg3.lengthOfSegment();
        System.out.println(len);
    }
}