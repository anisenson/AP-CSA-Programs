public class Rectangle {
    private int length; // instance variables
    private int width;
    private String color;
    // constructor
    public Rectangle(String rColor, int rWidth, int rLength){
    color = rColor;
    width = rWidth;
    length = rLength;
    }
    public String getColor() {
    return color;
    }
    public int getWidth() {
    return width;
    }
    public int getLength() {
    return length;
    }
}