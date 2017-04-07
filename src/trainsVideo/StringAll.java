package trainsVideo;

public class StringAll {

	public static void addNumbers(String str){
		String str2="";
		StringBuffer stringBuffer = null;
		for(int i=0;i<str.length();i++){
			stringBuffer = new StringBuffer(str.substring(i, i+1));
				str2+=stringBuffer.append("1");
		}
		System.out.println(str2);
	}
	
	public static void isCharPresent(String ourChar){
		 char searchChar = 'h';
		 int index =0;
		 boolean result= false;
		 for (int i = 0; i < ourChar.length(); ++i) {
		        if (ourChar.charAt(i) == searchChar) {
		        	result = true;
		            break; // первое вхождение
		        }
		    }
		 System.out.println("Char is found: "+ result + ourChar.indexOf(searchChar));
		   
	}


	
	public static void main(String[] args){
	 String str = "abst";
	 String str2 = "a1b1s1t1";
	 String habr = "fabrahabr";
	 addNumbers(str);
	 isCharPresent(habr);
	}

}
