package basicPrograms;

public class ArraySort {

	public static void sortArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test= {4,5,6,3,1,22,43,12,2,15};
		
		sortArray(test);

	}

}
