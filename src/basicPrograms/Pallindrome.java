package basicPrograms;

public class Pallindrome {

	public static boolean isPallindrome(String str) {

		String temp = "";

		System.out.println("Input String: " + str);
		for (int i = str.length() - 1; i >= 0; i--) {

			temp = temp + str.charAt(i);

		}

		if (str.equals(temp))
			return true;

		else
			return false;

	}

	public static void main(String[] args) {

		System.out.println(isPallindrome("NITIN"));
		System.out.println(isPallindrome("TEST"));

	}

}
