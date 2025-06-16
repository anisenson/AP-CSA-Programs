// Adam Nisenson and Sandeep Singh

import java.util.Scanner;

public class PlayPig {

    // Main method that starts the game.
    public static void main(String[] args) {
        play();
    }

    // Method to display the rules of the game to the players.
    public static void welcome() {
        System.out.println("*** Welcome to the Game called Pig! ***");
        System.out.println("Each player will take turns rolling a dice and the first to reach 100 wins.");
        System.out.println("If a 1 is rolled on a turn, the player busts and earns nothing for their turn.");
        System.out.println("If a 1 is NOT rolled, the player may choose to keep rolling or hold.");
        System.out.println("If the player holds, the total of the rolls in that turn is added to their score.");
        System.out.println("If the player rolls a 1 before holding, they get nothing that turn.\n");
    }


    // Method to display the current scoreboard showing each player's name and score.
    public static void displayScoreboard(Player p1, Player p2) {
        System.out.println("-------------- Scoreboard ---------------");
        System.out.println("Player 1: " + p1.getName() + " score: " + p1.getScore());
        System.out.println("Player 2: " + p2.getName() + " score: " + p2.getScore());
        System.out.println("----------------------------------------");
    }

 // Method to simulate a player's turn.
    public static int takeTurn(Player player, Scanner scanner) {
        int turnTotal = 0;
        boolean keepRolling = true;

        System.out.print(player.getName() + " ->type any letter to roll the dice: ");
        scanner.nextLine(); 

        while (keepRolling) {
            int roll = Player.rollDice();
            System.out.println(player.getName() + " - you rolled a " + roll);

            // If the player rolls a 1, they bust and get no points for this turn
            if (roll == 1) {
                System.out.println("Bust! Your turn is over. Nothing was added to your score.");
                turnTotal = 0;
                break;
            } else {
                turnTotal += roll;
                System.out.println("Your current round total is now: " + turnTotal);
                System.out.print(player.getName() + " -> ROLL AGAIN? Type y or n: ");
                String choice = scanner.nextLine().trim().toLowerCase();
                // If the player chooses not to roll again, end the turn
                if (!choice.equals("y")) {
                    keepRolling = false;
                }
            }
        }

        if (turnTotal > 0) {
            System.out.println(player.getName() + " your turn is over - " + turnTotal + " points added - your score is now: " + (player.getScore() + turnTotal));
        }

        return turnTotal;
    }

        // main method to play the game 
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        welcome();

        System.out.print("Enter player 1's name: ");
        Player p1 = new Player(scanner.nextLine());
        System.out.print("Enter player 2's name: ");
        Player p2 = new Player(scanner.nextLine());

        boolean playAgain = true;

        while (playAgain) {
            p1.resetScore();
            p2.resetScore();

            int roll1, roll2;
            do {
                System.out.print(p1.getName() + " ->type any letter to roll the dice: ");
                scanner.nextLine();
                roll1 = Player.rollDice();
                System.out.println("You rolled a " + roll1);

                System.out.print(p2.getName() + " ->type any letter to roll the dice: ");
                scanner.nextLine();
                roll2 = Player.rollDice();
                System.out.println("You rolled a " + roll2);

                if (roll1 == roll2) {
                    System.out.println("You tied - " + p1.getName() + " will go first\n");
                }
            } while (roll1 == roll2);

            Player current = (roll1 > roll2) ? p1 : p2;
            Player other = (current == p1) ? p2 : p1;
            System.out.println(current.getName() + " rolled a bigger # and will go first\n");

            boolean gameOver = false;
            boolean player2ExtraTurn = false;

            while (!gameOver) {
                int points = takeTurn(current, scanner);
                current.addToScore(points);
                displayScoreboard(p1, p2);

                if (current.getScore() >= 100) {
                    if (current == p1) {
                        player2ExtraTurn = true;
                        break; 
                    } else {
                        gameOver = true;
                    }
                }

                Player temp = current;
                current = other;
                other = temp;
            }
            
            // If Player 1 wins first, Player 2 gets one final turn to try and win
            if (player2ExtraTurn) {
                System.out.println(p2.getName() + " gets one more turn to try and win!");
                int finalPoints = takeTurn(p2, scanner);
                p2.addToScore(finalPoints);
                displayScoreboard(p1, p2);
            }

            // Determine and display the winner
            if (p1.getScore() > p2.getScore()) {
                System.out.println(p1.getName() + " Wins!!");
            } else if (p2.getScore() > p1.getScore()) {
                System.out.println(p2.getName() + " Wins!!");
            } else {
                System.out.println("It's a tie!");
            }

        }

        System.out.println("Thanks for playing!");
    }
}
