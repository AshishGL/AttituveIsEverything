package string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnMaxCount("additional account"));

	}
	
	public static int returnMaxCount(String test) {
		
		
		Map<Character,Integer> m1=new HashMap<>();
		int max=0;

		
		char[] tempCharArray=test.toCharArray();

		
		for(char ch:tempCharArray) {
			
			if(m1.containsKey(ch)) {
				m1.put(ch, m1.get(ch)+1);
			}
			else
				m1.put(ch, 1);
		}
		
		for(char ch:tempCharArray) {
			
			
			if(m1.get(ch)>max) {
				max=m1.get(ch);
			}
			
		}
				
		return max;
	}
	
	

}
