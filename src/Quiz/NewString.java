package Quiz;
//Complete the code below to print each letter in the string name followed by a space. 
public class NewString{
	
	public int nonVowelCount(String word)
    {
        int nonVowels=0;
		for(int i=0;i<word.length();i++){
			String value=word.substring(i, i+1).toLowerCase();
        		if(value.matches("[a-z]")&&!"aeiouy".contains(value)){
            		nonVowels++;	
        	}
        }
		return nonVowels;
    }

	public static void main(String[] args) {
		String name = "Udacity";
		String subStr="";
		
	    for(int i=0;i<name.length();i++){
	    	subStr=subStr+name.substring(i, i+1)+" ";
	       }
	    System.out.println(subStr);
	    
	    NewString ourString = new NewString();
	    System.out.println(ourString.nonVowelCount("TYifbhgtr*/*"));
	}
		
	
	
	
	
}
