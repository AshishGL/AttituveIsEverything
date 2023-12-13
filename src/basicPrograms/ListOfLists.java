package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> listOfLists = new ArrayList<>();

		List<String> innerList = new ArrayList<>();
		List<String> innerList2 = new ArrayList<>();

		innerList.add("Ashish");
		innerList.add("Sharma");

		innerList2.add("Anjali");
		innerList2.add("Nautiyal");

		listOfLists.add(innerList);
		listOfLists.add(innerList2);

		System.out.println(listOfLists);

	}

}
