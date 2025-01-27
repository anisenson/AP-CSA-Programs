import java.util.*;

// Fill in all the methods where it says WRITE YOUR CODE HERE ...
public class WhileLoopExercises {
    public static void main(String[] args) {
        System.out.println("Calling part1 method: ");
        part1();
        System.out.println("\nCalling part2 method: ");
        part2();
        System.out.println("\nCalling part3 method: ");
        part3();
        System.out.println("\nCalling part4 method: ");
        part4();
        System.out.println("\nCalling part5 method: ");
        part5();
        System.out.println("\nCalling part6 method: ");
        part6();
    }

    public static void part1() {
        // print all the integers 1 through 200 on separate lines
        System.out.println("Here are the integers from 1 to 200");
        int num = 0;
        while (num >= 0 && num <= 199){
            num++;
            System.out.println(num);
        }
        
    }

    public static void part2() {
        // print all the odd integers between 50 and 150 on separate lines.
        System.out.println("Here are the odd integers between 50 and 150");
        int num = 49;
        while (num >= 0 && num <= 147){
            num+= 2;
            System.out.println(num);
        }    
    }

    public static void part3() {
        // print all the multiples of 4 between 4 and 200, inclusive.
        System.out.println("Here are all the multiples of 4 between 4 and 200");
        int num = 4;
        while (num >= 0 && num <= 200){
            System.out.println(num);
            num+= 4;
        }        
    }

    public static void part4() {
        // print all the multiples of 20 from 1000 down to 20
        System.out.println("Here are all the multiples of 20 starting from 1000 and going down to 20");
        int num = 1000;
        while (num >= 20 && num <= 1000){
            System.out.println(num);
            num-= 20;
        }     
    }

    public static void part5() {
        // calculate and print the sum of all the numbers between 1 and 500.
        System.out.println("The sum of all the numbers between 1 and 500 is: ");
        int num = 1;
        int sum = 0;
        while (num <= 500){
            sum = num + sum;
            num++;
        } 
        System.out.println(sum);
    }

    public static void part6() {
        // This method asks the user for a starting integer value and ending integer
        // value,
        // and then calculates and prints the sum and average of all the integers
        // between
        // the starting and ending value (inclusive).
        // WRITE YOUR CODE HERE ...


        Scanner red = new Scanner(System.in);
        System.out.println("Enter a starting integer");
        int start = red.nextInt();
        System.out.println("Enter a ending integer");
        int end = red.nextInt();

        double average = ((double) start + end) / 2;
        System.out.println("\nThe average of those 2 numbers are: " + average);
        
        int sum = 0;
        int num = start;
        while (num <= end){
            sum = sum + num;
            num++;
        }
        System.out.println("\nThe sum of all integers between " + start + " and " + end + " is: " + sum);


    }
}