import java.awt.Color;


public class BouncingBalls {

    private Ball[] balls;
    private int width, height;

    public BouncingBalls(int w, int h)
    {
        width = w;
        height = h;
        balls = new Ball[3]; 
        balls[0] = new Ball(50,50,Color.RED);
        balls[1] = new ColorfulBall(10,10,20,5,8);
        balls[2] = new SizeChangingBall(200, 200, Color.CYAN, 50);

     


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
            StdDraw.pause(50); // this controls speed
            court.moveBalls();
            // set the background to light gray to erase
            StdDraw.clear(StdDraw.LIGHT_GRAY); //set every pixel
        } 


    }

}






/* fun Code


import java.awt.Color;
import java.util.ArrayList;

public class BouncingBalls {

    private ArrayList<Ball> balls;
    private int width, height;

    public BouncingBalls(int w, int h)
    {
        width = w;
        height = h;
        balls = new ArrayList<>(); // Use ArrayList to allow adding balls dynamically
        
        // Start with one ball
        balls.add(new Ball(0, 0, Color.WHITE));
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

    public void addBall()
    {
        int x = (int)(Math.random() * (width - 20)) - (width / 2);
        int y = (int)(Math.random() * (height - 20)) - (height / 2);
        Color color = new Color((int)(Math.random() * 256), 
                                (int)(Math.random() * 256), 
                                (int)(Math.random() * 256)); // Random color
        balls.add(new Ball(x, y, color));
    }

    public static void main(String[] args) {

        StdDraw.setXscale(-250, 250);
        StdDraw.setYscale(-250, 250);
        StdDraw.enableDoubleBuffering(); 

        BouncingBalls court = new BouncingBalls(250, 250);

        while (true)  
        { 
            // If spacebar is pressed, add a new ball
            if (StdDraw.isKeyPressed(32)) { // 32 is the ASCII code for the spacebar
                court.addBall();
            }

            court.drawBalls();
            StdDraw.show();
            StdDraw.pause(0);
            court.moveBalls();
            StdDraw.clear(StdDraw.LIGHT_GRAY);
        } 
    }
}



*/