package stringAndChar;

public class StringReverse {
	public static String reverseStringWithCharAt(String inputString) {
		String result = "";
		if (inputString==null || inputString.isEmpty()) {
			return inputString;
		}else{
		for (int i = inputString.length() - 1; i >= 0; i--) {
			result += inputString.charAt(i);
		}
		return result;
		}
	}
	public static String reverseWithCharArray(String inputString) {
		char[] charArray = inputString.toCharArray();
		String resultString = "";
		{
		for (int i = charArray.length - 1; i >= 0; i--) {
			resultString += charArray[i];
		}
		return resultString;
		}
	}

	public static String reverseString(String inputString){
		if (inputString==null || inputString.isEmpty()) 
			return inputString;
		String reversed = new StringBuffer(inputString).reverse().toString();
		return reversed;
		
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(reverseStringWithCharAt(str));
		System.out.println(reverseString(str));
		//System.out.println(reverseWithCharArray(str));
	}

}
