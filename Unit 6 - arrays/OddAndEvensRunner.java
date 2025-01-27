import java.util.Arrays;

public class OddAndEvensRunner
{
	public static void main( String args[] )
	{
		//add test cases

		// create 3 arrays with the values
		// 2 4 6 8 10 12 14
		int[] array1 = {2, 4, 6, 8, 10, 12, 14};
		// 1 2 3 4 5 6 7 8 9
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// 2 10 20 21 23 24 40 55 60 61
		int[] array3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};

		// call all the methods in OddsAndEvens class
		// be sure to print out the results

		System.out.println("Odds  - " + Arrays.toString(OddsAndEvens.getAllOdds(array1)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(array1)));
		System.out.println("");
		
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array2)));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(array2)));
		System.out.println("");

		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array3)));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(array3)));
		

	}
}