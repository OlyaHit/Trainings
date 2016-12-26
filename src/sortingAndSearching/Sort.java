package sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		int [] arr = {15,25,83,10,78,89,1};
		ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		for (int beforeSort: arr){
			System.out.print(beforeSort+ " ");
		}
		// sorting array
		   Arrays.sort(arr);
		System.out.println();  
		for(int afterSort: arr){
			System.out.print(afterSort+" ");
		}

		System.out.println();
		/*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   /* Sort statement*/
		   Collections.sort(listofcountries);
		   
		   System.out.println();
		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		
	}

}
