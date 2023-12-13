package basicPrograms;

public class MaxDigitInArray {
	
	public static int maxNum(int[] test) {
		
		int max=test[0];
		for(int i=1;i<test.length;i++) {
			
			if(test[i]>max)
				max=test[i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] best= {3,4,5,6,3,44,56,99};
		System.out.println(maxNum(best));

	}

}
