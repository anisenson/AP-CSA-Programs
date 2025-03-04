import java.awt.Color;
//subclass 1
public class SquareBall extends Ball {
    public SquareBall(int x, int y, int diam, Color color) {
        super(x, y, color); 
        setDiam(diam); 
    }

    @Override
    public void drawBall() {
        StdDraw.setPenColor(getColor());
        StdDraw.filledSquare(getX(), getY(), getDiam() / 2);
    }
}
