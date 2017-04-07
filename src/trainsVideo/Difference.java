package trainsVideo;

public class Difference {

	public static void main(String[] args) {
		///Преобразование типов
		String st = "20349";
		String st2 ="1544545";
		String iwe1 = "ert";
		try { 
	        Integer i1 = new Integer(iwe1);
	        System.out.println(i1);
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }   
		
		try {
	        Integer i2 = Integer.valueOf(st);
	        System.out.println(i2);    
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    }  

	
    try {
       int i3 = Integer.parseInt(st);
        System.out.println(i3);  
    } catch (NumberFormatException e) {  
        System.err.println("Неверный формат строки!");  
    } 

	      int x = Integer.parseInt("9");
	      double c = Double.parseDouble("5");
	      int b = Integer.parseInt("677");
	      
	      int myInt = Integer.parseInt(st2);
	      Integer newInt = new Integer (st2);
	      

	      System.out.println(x);
	      System.out.println(c);
	      System.out.println(b);
}
}
