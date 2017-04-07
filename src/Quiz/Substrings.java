package Quiz;

public class Substrings {

	private String myWord;
	
	public Substrings(String myWord){
		this.myWord =myWord;
	}
	
	  public String getSubstrings()
	    {
		  String splitStr = "";
		  for (int i=0; i<myWord.length();i++){
			  String var = myWord.substring(i, i+1);
			  if(var.equals(" ")){
				  var= "\n";
			  }
			  splitStr=splitStr+var;
		  }
			return splitStr;
	       
	    }
	
	public static void main(String[] args) {
		Substrings myFraz = new Substrings("Frank go to the cinema with friends");
		System.out.println(myFraz.getSubstrings());
	}

}
