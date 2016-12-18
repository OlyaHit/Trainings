package arrays;

import java.util.Arrays;

public class ReverseArray {
	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		}

	
	
	public static void main(String[] args) {
		int [] oldArray ={2,5,4,8,9};
		for (int i=oldArray.length-1;i>=0;i--){
			System.out.print(oldArray[i] + " ");
		} 
		//String message =Arrays.toString(oldArray);
		//System.out.println(message);
		System.out.println();
		int [] result =reverse(oldArray);
		for (int i=0;i<result.length;i++){
			System.out.print(result[i] + " ");
		}
}
}