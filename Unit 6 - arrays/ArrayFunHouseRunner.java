import java.util.Arrays;

public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

		//add test cases
        System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 3-7  =  " + ArrayFunHouse.getSum(two,3,7));
		System.out.println("sum of spots 1-4  =  " + ArrayFunHouse.getSum(two,1,4));
		System.out.println("# of 5s  =  " + ArrayFunHouse.getCount(two,5));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two,7));
		
		System.out.println("Remove 4s " + Arrays.toString(ArrayFunHouse.removeVal(two, 4)));

	}
}