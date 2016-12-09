package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> listOfStrings =new ArrayList<String>();
		listOfStrings.add("2");
		listOfStrings.add("3");
		listOfStrings.add("4");
		
		String [] arrayOfString = listOfStrings.toArray(new String [listOfStrings.size()]);
		System.out.println(Arrays.toString(arrayOfString));
	}

}
