package basicPrograms;

public class StringReverse {

	public static void reverse(String str) {

		System.out.println("Before : " + str);
		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		System.out.println("After : " + temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse("Test String");
		reverse("NITIN");

	}

}
