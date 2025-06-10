// Adam Nisenson and Sandeep Singh 

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int points) {
        score += points;
    }

    public void resetScore() {
        score = 0;
    }

    public int Turn(java.util.Scanner scanner){
    int Total = 0;
    boolean keepRolling = true;

    while (keepRolling){
        int roll = rollDice();
        System.out.println(name + " rolled "+ roll);

        if(roll == 1){
            System.out.println("Bust!");
            Total =0;
            keepRolling = false;
        }
        else{
            Total += roll;
            System.out.println("turn total: " + Total );
            System.out.println( "Enter 1 to roll again or 2 to hold: ");
            if(scanner.nextInt() != 1){
                keepRolling = false;
            }
        }
    }
    return Total;
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}
