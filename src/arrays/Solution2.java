package arrays;

import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		// you can write to stdout for debugging purposes, e.g.

		System.out.println(checkSoftwareVersion("1.2.0", "3.2.0"));
		System.out.println(checkSoftwareVersion("1.2", "1.0.0"));

	}

	public static int checkSoftwareVersion(String s1, String s2) {

		String[] first = s1.split(".");
		String[] second = s1.split(".");

		for (int i = 0; i < first.length; i++) {
			int temp1 = Integer.parseInt(first[i]);
			int temp2 = Integer.parseInt(second[i]);

			if (temp1 > temp2)
				return 1;

			else if (temp1 == temp2)
				continue;

			else
				return -1;

		}
		return 0;
	
}
}
