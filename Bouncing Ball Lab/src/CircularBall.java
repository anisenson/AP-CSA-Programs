import java.awt.*;
//subclass 3
public class CircularBall extends Ball {
    private double angle;
    private int centerX, centerY;
    private int radius;
    
    public CircularBall(int x, int y, int d, Color c) {
        super(x, y, d, 0, 0, c);
        this.centerX = x;
        this.centerY = y;
        this.radius = 50; 
        this.angle = 0;
    }
    
    @Override
    public void move(int width, int height) {
        angle += Math.PI / 30; 
        int xNew = (int) (centerX + radius * Math.cos(angle));
        int yNew = (int) (centerY + radius * Math.sin(angle));
        
        setxLoc(xNew);
        setyLoc(yNew);
    }
}
