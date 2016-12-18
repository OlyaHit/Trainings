package arrays;

import java.util.Arrays;

public class duplicateIntArray {

	public static void main(String[] args) {
		int [] dupDigits = {1,8,2,5,5,2,8,5,14,8,2};
		Arrays.sort(dupDigits);
		
		for (int i=1;i<dupDigits.length;i++){
			if(dupDigits[i-1]==dupDigits[i]){
			System.out.println(dupDigits[i]);
			i+=1;
			}
		}

	}

}
