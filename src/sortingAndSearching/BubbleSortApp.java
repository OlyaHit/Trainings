package sortingAndSearching;

public class BubbleSortApp
   {
   public static void main(String[] args)
      {
	   int arr[] = new int[10];
	   for(int i = 0; i < arr.length; i++) {
	       //�������� ������� ������������� ��������� ����� �� 0 �� 99
	       arr[i] = (int)(1+Math.random() * 100);
	       System.out.print(arr[i] + "  ");
	   }
	   //����������� ��� 1
	   for (int i=arr.length-1;i>0;i--){
		   for(int j=0;j<i;j++){
			   if(arr[j]>arr[j+1]){
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   } 
	   }
	   System.out.println();
	   for (int ourArray:arr){
		   System.out.print(ourArray+ "  ");
	   }
	 //����������� ��� 2
	   for (int i=0;i<arr.length-1;i++){
		   for(int j=0;j<arr.length-i-1;j++){
			   if(arr[j]>arr[j+1]){
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   } 
	   }
	   System.out.println();
	   for (int ourArray:arr){
		   System.out.print(ourArray+ "  ");
	   }
	   //��������
	   for (int i=arr.length-1;i>0;i--){
		   for(int j=0;j<i;j++){
			   if(arr[j]<arr[j+1]){
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   } 
	   }
	   
	   System.out.println();
	   for (int ourArray:arr){
		   System.out.print(ourArray+ "  ");
	   }
	   
	   
      }  
   }  
////////////////////////////////////////////////////////////////
