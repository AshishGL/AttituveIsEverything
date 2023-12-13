package basicPrograms;

public class PrimeNumberCheck {

	public static boolean isPrime(int num) {

		boolean flag = true;
		System.out.print("Prime Check: " + num + " - ");

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(10));
		System.out.println(isPrime(7));
		System.out.println(isPrime(11));

	}

}
