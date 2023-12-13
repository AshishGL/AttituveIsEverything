package collections;

import java.util.ArrayList;
import java.util.Collections;

public class secondLargestString {
	
	public static void main(String[] args) {
		
		ArrayList<String> testList=new ArrayList();
		testList.add("Test");
		testList.add("AshishSharmaaahjhjhjhaa");
		
		testList.add("AnjaliNautiyal");
		testList.add("MSDhoni");
		
		int length=testList.size();
		testList.sort(null);
        Collections.sort(testList);
		System.out.println(testList);
		System.out.println(testList.get(1));
		
		
	}

}
