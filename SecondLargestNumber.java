package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 7, 6, 9, 4, 12, 11, 14 };
		int res = a.length;
		Arrays.sort(a);
		System.out.println("the value in the array is : " + Arrays.toString(a));
		int largestNumber = a[res - 2];
		System.out.println("The second larges number is : " + largestNumber);

	}

}

//a 