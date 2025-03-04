import java.awt.Color;


public class BouncingBalls {

    private Ball[] balls;
    private int width, height;

    public BouncingBalls(int w, int h) {
        width = w;
        height = h;
        balls = new Ball[6]; 
        balls[0] = new Ball(50, 50, Color.RED);
        balls[1] = new ColorfulBall(10, 10, 20, 5, 8);
        balls[2] = new SizeChangingBall(200, 200, Color.ORANGE, 50);
        balls[3] = new SquareBall(200, 200, 20, Color.YELLOW ); //subclass 1
        balls[4] = new AdaptiveBall(0, 0, 20, 4, 5, Color.GREEN); //subclass 2
        balls[5] = new CircularBall(0, 0, 20, Color.BLUE); //subclass 3
    }
    


    public void moveBalls()
    {
        for(Ball b: balls)
            b.move(width, height);
    }

    public void drawBalls()
    {  
        for(Ball b: balls)
            b.drawBall(); 

    }


    public static void main(String[] args) {

        // initialize standard drawing
        StdDraw.setXscale(-250, 250);
        StdDraw.setYscale(-250, 250);
        StdDraw.enableDoubleBuffering(); //smooths animation performation
        BouncingBalls court = new BouncingBalls(250,250);
        while (true)   //bounce forever
        { 
            court.drawBalls();

            // display and pause for 50 ms
            StdDraw.show();
            StdDraw.pause(10); // this controls speed
            court.moveBalls();
            // set the background to light gray to erase
            StdDraw.clear(StdDraw.LIGHT_GRAY); //set every pixel
        } 


    }

}