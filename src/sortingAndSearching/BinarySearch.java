package sortingAndSearching;

public class BinarySearch {

	public static void main(String[] args) {
		int [] myArray ={2,5,8,9,10,15,77};
		int search =10;
		int first = 0;
		int last = myArray.length-1;
		int middle = (first+last) /2;
		
			while (first<=last){
				if(myArray[middle]==search){
					System.out.println(search + " found at location " + (middle + 1) + ".");
			           break;
				}
				else if(myArray[middle]<search){
					first = middle + 1;
				}
				else
				{
					last = middle - 1;
				}
				middle = (first+last) /2;	
				
			}
			if (first>last){
				System.out.println(search + " is not found.\n");
			}
			
			
			
		}

	}


