import java.awt.Font;

public class RaceRunner {
    static final int LIMIT = 500;

    public static void main(String[] args) {
        // Setup
        StdDraw.setCanvasSize(LIMIT, LIMIT);
        StdDraw.setXscale(0, LIMIT);
        StdDraw.setYscale(0, LIMIT);
        StdDraw.enableDoubleBuffering();

        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.setTitle("Snowman Race");

        // create at least 2 instances/objects of a Snowman

        // The first snowman should be at x=10, y = 50
        // The second snowman should be at x=10, y = 150
        // The third snowman should be ???
        // ****** ADD CODE HERE *****
        Snowman s1 = new Snowman(10, 50, "cat_snowman.png", "cat");
        Snowman s2 = new Snowman(10, 150, "felt_snowman.png", "felt");
        Snowman s3 = new Snowman(10, 200, "redhat_snowman.png", "red hat");

        // Main game loop
        while (true) {
            StdDraw.clear();

            // When the spacebar is pressed - make the snowmen move
            if (StdDraw.isKeyPressed(java.awt.event.KeyEvent.VK_SPACE)) {
                // Call the move method on each snowman instance
                s1.move();
                s2.move();
                s3.move();
            }

            // Call the draw method on each snowman
            s1.draw();
            s2.draw();
            s3.draw();

            // Check if there is a winner - they reached the edge of the canvas
            if (s1.getX() >= LIMIT) {
                StdDraw.text(LIMIT / 2, LIMIT - 70, s1.getName() + " WINS!!!");
                StdDraw.show();
                StdDraw.pause(3000); 
                System.exit(0);
            }
            if (s2.getX() >= LIMIT) {
                StdDraw.text(LIMIT / 2, LIMIT - 70, s2.getName() + " WINS!!!");
                StdDraw.show();
                StdDraw.pause(3000); 
                System.exit(0);
            }
            if (s3.getX() >= LIMIT) {
                StdDraw.text(LIMIT / 2, LIMIT - 70, s3.getName() + " WINS!!!");
                StdDraw.show();
                StdDraw.pause(3000); 
                System.exit(0);
            }

            // Refresh screen
            StdDraw.show();
            StdDraw.pause(20);
        }

    }
}
