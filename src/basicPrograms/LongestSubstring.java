package basicPrograms;

public class LongestSubstring {

	public static String longestSubstring(String str) {

		String temp = "";
		String[] splitString = str.split(" ");

		for (int i = 0; i < splitString.length; i++) {
			if (splitString[i].length() > temp.length())
				temp = splitString[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubstring("My Name is Ashishhh Sharmaji"));
	}
}
