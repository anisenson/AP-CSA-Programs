import java.awt.*;;

public class SizeChangingBall extends Ball {
    private int maxDiameter;
    private int minDiameter;
    private int diameterStep;

    public SizeChangingBall(int xStart, int yStart, Color c, int maxD){
        super(xStart, yStart, c);
        maxDiameter = maxD;
        minDiameter = 2;
        diameterStep = 1;
    }

    public void changeDiameter(){
        int diam = getDiam();
        diam += diameterStep;

        if (diam >= maxDiameter || diam <= minDiameter){
            diameterStep = -diameterStep; 
        }

        setDiam(diam); 
    }

    public void move (int width, int height){
        super.move(width, height);
        changeDiameter();
    }




    //Subclass 1
    public void drawBall() {
        int x = getX();
        int y = getY();
        int size = getDiam();
        
        // Draw a square
        StdDraw.setPenColor(getColor());
        StdDraw.filledSquare(x, y, size / 2);
    }
}
