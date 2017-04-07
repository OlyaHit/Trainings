package Quiz;

	public class Compare {
			public static boolean compareTwoArrays(int[] arr1, int[] arr2){
				for(int i=0; i<arr1.length; i++){
					for(int a=0;a<arr2.length;a++){
				if(arr1[i]==arr2[a]){
					return true;
				}
			}
					
		}
				return false;
	}
	
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5};
		int[] arr2={3,8,1,7,6};
		System.out.println(compareTwoArrays(arr1,arr2));
	}

}
