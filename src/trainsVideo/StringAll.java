package trainsVideo;

public class StringAll {
	
	public static void main(String[] args){
		 String str = "abst";
		 String str2 = "a1b1s1t1";
		 String habr = "fabrahabr";
		 addNumbers(str);
		 isCharPresent(habr);
		  StringBuilder sb=new StringBuilder("toto,");
		    System.out.println(sb.deleteCharAt(sb.length()-1));
		}

	public static void addNumbers(String str){
		String str2="";
		StringBuffer sb = null;
		for(int i=0;i<str.length();i++){
			sb = new StringBuffer(str.substring(i, i+1));
				str2+=sb.append("1");	
		}
		sb= new StringBuffer(str2);
		System.out.println(sb.deleteCharAt(sb.length()-1));
	}
	
	public static void isCharPresent(String ourChar){
		 char searchChar = 'h';
		 boolean result= false;
		 for (int i = 0; i < ourChar.length(); ++i) {
		        if (ourChar.charAt(i) == searchChar) {
		        	result = true;
		            break; // первое вхождение
		        }
		    }
		 System.out.println("Char is found: "+ result + ourChar.indexOf(searchChar));
		   
	}


	
	

}
