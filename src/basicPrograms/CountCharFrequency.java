package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountCharFrequency {
	
	public static Map charCount(String str) {
        Map<Character,Integer> charMap=new HashMap<Character,Integer>();		
        
        str=str.toLowerCase();
        char[] charArray=str.toCharArray();
        
        for(int i=0;i<charArray.length;i++) {
        	
        	if(charMap.containsKey(charArray[i]) && charArray[i]!=' ') {
        		charMap.put(charArray[i], charMap.get(charArray[i])+1);
        	}
        	else
        		charMap.put(charArray[i], 1);

        }
		
		return charMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(charCount("Ashish Sharma"));

	}

}
