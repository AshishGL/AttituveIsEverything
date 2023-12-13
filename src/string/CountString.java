package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="My Name is Ashish .Sharma.";
		
		String[] strArray=test.split(" ");
		String regex="[a-zA-Z].$";
		String regex1="[a-zA-Z]?$";
		String regex2="[a-zA-Z],$";
		String regex3="[a-zA-Z]";

		
		int count=0;
		for(int i=0;i<strArray.length;i++) {
			
			if(strArray[i].matches(regex) || strArray[i].matches(regex1) || strArray[i].matches(regex2) || strArray[i].matches(regex3) ) {
				count++;
			}
			
			
		}
     System.out.println(count);
	}

}
