package stringAndChar;

public class SortTest {

	public static void main(String[] args) {
		  //Sort array of string
		  String Array[]={"cat", "ape", "dog", "horse", "zebra", "horse", "horse" };
		  String  temp; 

		    for(int j=0; j<Array.length-1;j++){
		        for (int i=j+1 ; i<Array.length; i++){
		            if(Array[i].compareTo(Array[j])<0) {
		                temp= Array[j];
		                Array[j]= Array[i]; 
		                Array[i]=temp;
		            }
		        }

		     }
		    for(int i = 0; i < Array.length; i++){
		        System.out.println(Array[i]);
		    }
		   
		    int duplicates = 0;
		    for (int k=0;k<Array.length-1;k++){
		    	for(int b=k+1;b<Array.length; b++){
		    		if(Array[b].compareTo(Array[k])==0){
		    			duplicates++;
		    		}
		    		
		    	}
		    }
		  
		    System.out.println(duplicates);

		  
	}

}
