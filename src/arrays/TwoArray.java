package arrays;

public class TwoArray {

	public static void main(String[] args) {
		int[][] arrInt = { {1,2} , {3,4,5} };
	        for(int i=0; i< arrInt.length; i++){
	            for(int j=0;j < arrInt[i].length; j++){
	                System.out.print(arrInt[i][j]+" ");
	            }
	            System.out.println("");
	        }
	}

}
