package trainsVideo;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ProbaArray {

	public static int getMaxValue (int [] arr){
		int maxValue=arr[0];
		for(int i=1;i<arr.length;i++){
			if(maxValue<arr[i]){
				maxValue=arr[i];
			}
		}
		return maxValue;
	}
	
	public static void printChar(String str){
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
	}
	
	public static void reverseArray (int [] arr){
		for (int i=0; i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.print(Arrays.toString(arr));
		
	}
	
	public static boolean isPalindrom (String str){
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindromNumber (int number){
		String str = Integer.toString(number);
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void selectAllDuplicates(int [] arr ){
		Arrays.sort(arr);
		for (int i=1;i<arr.length;i++){
			if (arr[i]==arr[i-1]){
				System.out.println(arr[i]);
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		int [] arr  = {3, 8, 3, 7, 9, 15, 3, 8, 8, 9};
		//System.out.println(getMaxValue(arr));
		//printChar("London");
		reverseArray(arr);
		//System.out.println(isPalindrom("MADvAM"));
		//System.out.println(isPalindromNumber(1283321));
		//selectAllDuplicates(arr);
	}

}
