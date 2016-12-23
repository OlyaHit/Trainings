package arrays;

public class CharArrayToString {
	public static void main(String args[])
	   {
	      // Method 1: Using String object
	      char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
	      String str = new String(ch);
	      System.out.println(str);
	 
	      // Method 2: Using valueOf method
	      String str2 = String.valueOf(ch);
	      System.out.println(str2);
	      
	      String str3 = "Hello";
	      for(int i=0; i<str3.length();i++){
	        char litter = str3.charAt(i);
	        System.out.println(litter);
	   }
}
}