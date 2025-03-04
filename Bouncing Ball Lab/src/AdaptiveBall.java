import java.awt.*;
//subclass 2
public class AdaptiveBall extends Ball {
    public AdaptiveBall() {
        super();
    }
    
    public AdaptiveBall(int x, int y, int d, int xMove, int yMove, Color c) {
        super(x, y, d, xMove, yMove, c);
    }
    
    @Override
    public void move(int width, int height) {
        super.move(width, height);
        
        int r = Math.abs(getX() % 256);
        int g = Math.abs(getY() % 256);
        int b = Math.abs((getX() + getY()) % 256);
        
        setColor(new Color(r, g, b));
    }
    
}