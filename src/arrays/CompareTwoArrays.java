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
	}

}
