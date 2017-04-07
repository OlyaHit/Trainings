package trainsVideo;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ArrayReverse {
	
	public static void reverseArray (String [] ourArray){
		
		List <String> listOfProducts = Arrays.asList(ourArray);
		Collections.reverse(listOfProducts);
		String [] reversed = listOfProducts.toArray(ourArray);
		System.out.println(Arrays.toString(reversed));
	}
	
	public static void main(String[] args) {
		String [] typeInsurence = {"Life","Car","Helth"};
		reverseArray(typeInsurence);

	}

}
