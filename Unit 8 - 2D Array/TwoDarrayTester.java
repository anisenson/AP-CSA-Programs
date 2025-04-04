public class TwoDarrayTester {

	public static void main(String[] args) {
		int [][] my2Darr = { {1, 2, 3, 4}, 
				     {1, 2, 3, 0}, 
				     {0, -5, 6, 12}};
		
		// call sumColumn to sum up each column
        int sumFirstCol  = sumColumn(my2Darr, 0); // *****fill in parameters to pass to the method
        int sumSecondCol = sumColumn(my2Darr, 1);
        int sumThirdCol  = sumColumn(my2Darr, 2);
        int sumFourthCol = sumColumn(my2Darr, 3);
        
		
		System.out.println("The sum of the elements in the 1st column should be 2 \t the method returned: " + sumFirstCol);
		System.out.println("The sum of the elements in the 2nd column should be -1 \t the method returned: " + sumSecondCol);
		System.out.println("The sum of the elements in the 3rd column should be 12 \t the method returned: " + sumThirdCol);
		System.out.println("The sum of the elements in the 4th column should be 16 \t the method returned: " + sumFourthCol);
		
		System.out.println();

		// *****write code to call sumRow for each row
		int sumFirstRow = sumRow(my2Darr, 0);
        int sumSecondRow = sumRow(my2Darr, 1);
        int sumThirdRow = sumRow(my2Darr, 2);
		
		
		System.out.println("The sum of the elements in the 1st row should be 10 \t the method returned: " + sumFirstRow);
		System.out.println("The sum of the elements in the 2nd row should be 6 \t the method returned: " + sumSecondRow);
		System.out.println("The sum of the elements in the 3rd row should be 13 \t the method returned: " + sumThirdRow);
		
		
	}

	public static int sumColumn(int [][] arr, int col){
		// *****write code to return the sum of the column, col, in the 2-D array.
		int sum = 0;
		for(int x = 0; x < arr.length; x++){ // loop over all the rows for the given column
            sum += arr[x][col]; // sum up the elements
        }
                     
		return sum;
	}
	public static int sumRow(int [][] arr, int row){
		// *****write code to return the sum of the elements in the specified row in the 2-D array.
		int sum = 0;
		for (int x = 0; x < arr[row].length; x++) // loop over all the columns for the given row
            sum += arr[row][x]; // sum up the elements
			
		return sum;
	}
}