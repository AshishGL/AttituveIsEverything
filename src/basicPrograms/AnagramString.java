package basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramString {

	public static List<String> listAnagram(String[] test){
		List<String> outputString=new ArrayList<>();
		
		for(int i=0; i<test.length;i++) {
			
			for(int j=i;j<test.length;j++) {
			if(checkAnagram(test[i], test[j])) {
				outputString.add(test[j]);
			}
			
		}
		}
		System.out.println(outputString);
		
		return null;
	}

	public static boolean checkAnagram(String str1, String str2) {

		boolean flag = false;
		if (str1.length() == str2.length()) {

			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();

			Arrays.sort(str1Array);
			Arrays.sort(str2Array);

			//System.out.println(str1Array);
			//System.out.println(str2Array);

			for (int i = 0; i < str1Array.length; i++) {

				//System.out.println(str1Array[i]);
				if (str1Array[i] == str2Array[i]) {
					flag = true;

				}

				else {
					flag = false;
					break;
				}
			}

		}
	//	System.out.println(flag);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String[] testList= {"cat","bat","tac","tab","abs"};
		
		//checkAnagram("map", "pak");
		listAnagram(testList);

	}

}
