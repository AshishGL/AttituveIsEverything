package basicPrograms;

public class SwapWOThirdVariable {
	
	public static void swapTwoNumber(int a, int b) {
		
		System.out.println("Before Swapping : A="+a+" B="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping : A="+a+" B="+b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       swapTwoNumber(10, 20);
		
		
	}

}
