package basicPrograms;

public class FibonacciSeries {
	
	public static void generateFibonacci(int num) {
		
		int a=0,b=1;
		
		System.out.println(a);
		while(num>1) {
			
			int c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
			num=num-1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateFibonacci(22);

	}

}
