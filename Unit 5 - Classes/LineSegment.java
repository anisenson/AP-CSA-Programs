public class LineSegment {
    private Point p1;
    private Point p2;
    private String labelPoint1;
    private String labelPoint2;


    public LineSegment(Point p1, Point p2, String labelPoint1, String labelPoint2) {
        this.p1 = p1;
        this.p2 = p2;
        this.labelPoint1 = labelPoint1;
        this.labelPoint2 = labelPoint2;
    } 

    public LineSegment(Point p1, Point p2) {
        this(p1, p2, "A", "B");
    }

    // Getters
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String getLabelPoint1() {
        return labelPoint1;
    }

    public String getLabelPoint2() {
        return labelPoint2;
    }

    public String toString(){
        return labelPoint1 + p1 + " to " + labelPoint2 + p2;
    }

    public double lengthOfSegment() {
        double diffX = p1.getX() - p2.getX();
        double diffY = p1.getY() - p2.getY();
        return Math.sqrt((diffX * diffX) + (diffY * diffY));
    }
}
