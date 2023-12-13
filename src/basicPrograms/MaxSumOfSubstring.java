package basicPrograms;

public class MaxSumOfSubstring {
	
	public static int maxSum(int[] arr,int substringLength) {
		
		int max=0;
		int temp=0;
		for(int i=0;i<=arr.length-substringLength;i++) {
			
			for(int j=0;j<substringLength;j++) {
				
				 temp=temp+arr[j+i];
				
			}
		//	 System.out.println(temp);

			if(temp>max) {
				max=temp;
				temp=0;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test= {1,3,4,5,6,7,4,7,8,3};
		System.out.println(maxSum(test, 2));

	}

}
