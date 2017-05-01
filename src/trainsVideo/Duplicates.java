package trainsVideo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Duplicates {

	public static void main(String[] args) {

		String[] arr = { "hel", "mel", "kel", "hel", "mel" };
		System.out.println(bruteforce(arr));
	}

	public static boolean bruteforce(String[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkDuplicateUsingSet(String[] input) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(input));
		HashSet<String> inputSet = new HashSet<String>(inputList);
		if (inputSet.size() < inputList.size())
			return true;
		return false;
	}

}
