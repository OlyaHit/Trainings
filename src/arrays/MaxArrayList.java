package arrays;

import java.util.ArrayList;

public class MaxArrayList {

	
	
	public static void main(String[] args) {
	ArrayList<Integer> arl = new ArrayList<Integer>();
	arl.add(25);
	arl.add(35);
	arl.add(55);
	arl.add(55);
	arl.add(15);
	arl.add(55);
	
	Integer lagest = arl.get(0);
	for(int i =1; i<arl.size();i++){
		Integer digit = arl.get(i);
		if(digit> lagest){
			lagest = digit;
		}
	}
	
	System.out.println(lagest);
	}
}
