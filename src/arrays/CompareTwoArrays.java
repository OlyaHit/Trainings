package arrays;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrays {

	
	public static void main(String[] args) {
		
		List <String> al1= new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("rt");

        List<String> al2= new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");
        //Storing the comparison output in ArrayList<String>
        List<String> al3= new ArrayList<String>();
        for (String temp:al1){
        	if(al2.contains(temp)){
        		al3.add("YES");
        		
        	}else{
        		al3.add("NO");
        	}
        }
        System.out.println(al3);
        
        int [] array1 ={1, 2, 3, 5, 6, 7};
        int [] array2 ={1, 2, 4, 5, 6};
        
        List <String> result = new ArrayList <String>();
        for (int i =0, j=0; i<array1.length &&j<array2.length ;i++, j++){
        	if (array1[i]==array2[j]){
        		result.add("YES");
        	}else{
        		result.add("NO");
        	} 
        }
        System.out.println(result);
	}

}
