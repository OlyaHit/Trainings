package sortingAndSearching;

public class LinearSearch {

	public static void main(String[] args) {
		int [] myArray ={2,5,8,9,10,15,77};
		int seachValue = 78;
		int i;
		for(i=0;i<myArray.length;i++){
			if (myArray[i]==seachValue){
				System.out.println(seachValue+" is present at location "+(i+1));
				break;
			}	
		}
		if (i==myArray.length){
			System.out.println(seachValue + " doesn't exist in array.");
		}
	}

}
