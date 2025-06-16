// Adam Nisenson and Sandeep Singh 

//player class with their name and score 
public class Player {
    private String name; //players name
    private int score; //players score 

    public Player(String name) { //constructor to initialize the player with their name and starting score of 0
        this.name = name;
        this.score = 0;
    }

    public String getName() { //returns players name
        return name;
    }

    public int getScore() { // returns players score 
        return score;
    }

    public void addToScore(int points) { //adds points to players score
        score += points;
    }

    public void resetScore() { //resets score to 0
        score = 0;
    }

    public int Turn(java.util.Scanner scanner){ //method to simulate players turn.
    int Total = 0;
    boolean keepRolling = true;

    while (keepRolling){
        int roll = rollDice(); //roll the dice
        System.out.println(name + " rolled "+ roll);

        if(roll == 1){
            System.out.println("Bust!");
            Total =0;
            keepRolling = false;
        }
        else{
            Total += roll; // Add the rolled points to the total for the turn
            System.out.println("turn total: " + Total );
            System.out.println( "Enter 1 to roll again or 2 to hold: ");
            // Ask the player if they want to roll again or hold (finish their turn)
            if(scanner.nextInt() != 1){
                keepRolling = false;
            }
        }
    }
    return Total;
    }

    // Helper method to simulate rolling a 6-sided dice
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}
