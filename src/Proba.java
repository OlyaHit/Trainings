
public class Proba {

	int [] array = new int[10];
	String [] array2 = new String [100];
	char [] myChar = {'a','b','c'};
	
	public static int getFactorial (int a){
		int result=1;
		
		for (int i=1;i<=a;i++){
			result*=i;
		}
		return result;
		
	}
	
	public static int getFactorial2(int a){
		int result=1;
		int i=1;
		while (a>0){
			result*=a;
			a--;
		}
		return result;
		
	}
	
	public static void fibo(){
		int firstN= 1;
		int secondN=0;
		int fibonachi;
		int sum=0;
		for(int i=0;i<10;i++){
			fibonachi=firstN+secondN;
			sum = sum +fibonachi;	
			firstN=secondN;
			secondN=fibonachi;
			System.out.print(fibonachi +" ");
		}
		System.out.println();
		System.out.print(sum +" ");
	}
	
	public static boolean isPalindrom (int[] arr){
		for (int i=0;i<arr.length;i++){
			if (arr[i]!=arr[arr.length-i-1]){
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(getFactorial(5));
		//System.out.println(getFactorial2(5));
		//fibo();
		int [] array= { 1, 2, 3, 4, 3, 2, 1};
		System.out.println(isPalindrom (array));
	}

}
