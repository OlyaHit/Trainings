package trainsVideo;

import java.util.ArrayList;
import java.util.Collections;

public class IntToArray {

	public static void convertItnToArray(int numbers) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
		    array.add(numbers % 10);
		    numbers /= 10;
		} while  (numbers > 0); 
		
		Collections.reverse(array);
		
		for (int ourArray: array){
			System.out.println(ourArray);
		}
	}

	public static void main(String[] args) {
		int number = 3545;
		convertItnToArray(number);

	}

}
