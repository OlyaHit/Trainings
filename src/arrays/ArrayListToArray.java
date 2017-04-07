package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> listOfStrings =new ArrayList<String>();
		listOfStrings.add("2");
		listOfStrings.add("3");
		listOfStrings.add("3");
		
		List<String> second = new ArrayList<>();
		second.addAll(listOfStrings);
		second.add(0,"25");
		second.remove(1);
		second.set(2, "4");
		String some = second.get(0);
		String [] arrayOfString = listOfStrings.toArray(new String [listOfStrings.size()]);
		System.out.println(Arrays.toString(arrayOfString));
		System.out.println(second);
		System.out.println(some);
	}

}
