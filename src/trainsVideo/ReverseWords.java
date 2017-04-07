package trainsVideo;

public class ReverseWords {
	
	public static String reverseWords (String someString){
		if (someString.trim().isEmpty()|| someString==null) {
			  return someString;
			  }
		String[] sa = someString.trim().split("\\s");
		StringBuffer reverse = new StringBuffer(); 
		
		for (int i=sa.length-1;i>=0;i--){
			reverse.append(sa[i]);
			reverse.append(' ');
		}
		return reverse.toString().trim();
		
	}

	
	public static void main(String[] args) {
		System.out.println(reverseWords("App1 app2 app3"));
		System.out.println(new StringBuffer("Java Concept Of The Day").reverse().toString());
	}

}
