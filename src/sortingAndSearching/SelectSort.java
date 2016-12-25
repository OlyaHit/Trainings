package sortingAndSearching;

public class SelectSort {

	public static void main(String[] args) {
		int arr[] = new int[10];
		   for(int i = 0; i < arr.length; i++) {
		       //элементу массива присваивается случайное число от 0 до 99
		       arr[i] = (int)(Math.random() * 100);
		       System.out.print(arr[i] + "  ");
		   }
		   
		   for(int i=0;i<arr.length-1;i++){
			   int minIndex = i;
			   for(int j= i + 1;j< arr.length; j++){
				   if(arr[j] < arr[minIndex]){
					   minIndex=j;
				   }
				  
			   }
			   int temp = arr[minIndex];
			   arr[minIndex]= arr[i];
			   arr[i]=temp;
			  
		   }
		   System.out.println();
		   for(int ourArray:arr ){
			   System.out.print(ourArray+" ");
		   }
	}

}
