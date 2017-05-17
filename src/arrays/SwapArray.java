package arrays;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int [] array1 = {1,8,7,6,11,5,4,9,10};
		
		for (int i=0;i<array1.length/2;i++){
			int saved=array1[i];
			array1[i]=array1[i+array1.length/2];
			array1[i+array1.length/2]=saved;
		}
		//1
		System.out.println(Arrays.toString(array1));
		//2
		for (int newArray: array1){
			System.out.print(newArray + " ");
		}
	}
	

}
