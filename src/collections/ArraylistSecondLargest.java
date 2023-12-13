package collections;

import java.util.ArrayList;

public class ArraylistSecondLargest {

	public static void main(String[] args) {

		ArrayList<String> testList = new ArrayList();
		testList.add("Test");
		testList.add("AshishSharma");
		testList.add("AnjaliNautiyal");
		testList.add("MSDhoni");

		int largest = testList.get(0).length(), secondLargest = testList.get(0).length();
		String largestString = testList.get(0);
		String secondLargestString = testList.get(0);
		for (int i = 0; i < testList.size(); i++) {

			if (testList.get(i).length() > largest) {

				secondLargest = largest;
				largest = testList.get(i).length();

			}

		}
		System.out.println(secondLargest);

	}

}
