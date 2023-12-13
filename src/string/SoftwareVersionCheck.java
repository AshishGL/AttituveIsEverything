package string;

public class SoftwareVersionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "1.2.3.6";
		String second = "1.2.3.5";

		String a = first.replace(".", "");
		int test = Integer.parseInt(a);

		String b = second.replace(".", "");
		int test1 = Integer.parseInt(b);

		if (test > test1)
			System.out.println("1");

		else if (test == test1)
			System.out.println("0");

		else
			System.out.println("-1");

	}

}
