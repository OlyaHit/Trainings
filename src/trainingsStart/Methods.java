package trainingsStart;

public class Methods {
		
	public void printUserInfo(String Name, String Surname, int age){
		
		System.out.println("My name is "+ Name +". My surname is "+ Surname+
				". My age is "+ age);
	}
	
	public int getDayNumberToEndMonth (int currentDay){
		
		boolean verificationResult = verifyCurrentDay (currentDay);
		
		if (verificationResult) {//True
			
		int dayNumber = 31 - currentDay;
		return dayNumber;
		}
		
		String errorMessage ="Invalid input data";
		System.out.println(errorMessage);
		
		return -1000;
	}
	
	public boolean verifyCurrentDay (int currentDay){
		
		if (currentDay >=1 && currentDay<=31){
			return true ;	
		}
		else {
			return false;
		}
	}

}
