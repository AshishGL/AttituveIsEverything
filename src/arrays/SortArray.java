package arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] testArray = { 6, 5, 3, 7, 1, 2, 3, 44, 32, 11, 10 };

		System.out.println("Before Sorting");
		for (int i = 0; i < testArray.length; i++)
			System.out.print(testArray[i] + " ");
		
		
		System.out.println("");
		System.out.println("After Sorting");
		Arrays.sort(testArray);

		for (int i = 0; i < testArray.length; i++)
			System.out.print(testArray[i] + " ");
	}

}
