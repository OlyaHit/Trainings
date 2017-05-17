package stringAndChar;
public class ReverseWord{
	
	public static void main(String[] args) {
		String input = "yu ka ba";
		String output = reverse(input);
		System.out.println(output);
	}
	
	// There is no built-in reverse method for strings in Java
	// There is one with String Builder, which does not give the output we want
	private static String reverse(String input) {
		verifyString(input);
		
		String reverse = "";
		if (input.length() == 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			for (String item : originalArray) { // this, is, a, test, string
				reverse = item + " " + reverse; // this + "", is + this, a + is this, test + a is this, string + test a is this
			}
		}
		
		return reverse.trim();
	}
	
	private static void verifyString (String input){
		
		if (input.isEmpty() || input.equals(null)) {
			System.out.println("Empty and null strings are not accepted");
		}
	}
}