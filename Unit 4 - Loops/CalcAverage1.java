import java.util.*;

public class CalcAverage1 {

    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to calculate an average (Enter -1 to end)");
        int input = red.nextInt();
        int count = 0;
        double average = 0;

        while (input != -1) {
            count++;
            sum = sum + input;
            System.out.println("Enter numbers to calculate an average (Enter -1 to end)");
            input = red.nextInt();
        }

        average = (double)sum / count;
        System.out.println("The average of your numbers is " + average);

    }

}
