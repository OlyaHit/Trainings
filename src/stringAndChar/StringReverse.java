package stringAndChar;

public class StringReverse {
	public static String reverseStringWithCharAt(String inputString) {
		String result = "";
		if (inputString.equals(null) || inputString.isEmpty()) {
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

	public static void main(String[] args) {
		String str = "123";
		System.out.println(reverseStringWithCharAt(str));
		//System.out.println(reverseWithCharArray(str));
	}

}
