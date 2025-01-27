public class Snowman {
        private double x;
        private double y;
        private String PictureFile;
        private String name;

        public Snowman(double initx, double inity, String initpictureFile, String initname){
            x = initx;
            y = inity;
            PictureFile = initpictureFile;
            name = initname;
        }

        public void move() {
            x += Math.random() * 8 + 1;
        }

        public String getName() {
            return name;
        }

        public double getX() {
            return x;
        }

        public void draw() {
            StdDraw.picture(x, y, PictureFile, 50, 60);
        }
    
}
