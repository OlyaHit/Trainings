package Quiz;

import java.util.Scanner;

public class DoWhileRange {
	
	Scanner scr = new Scanner(System.in);
	
	
	 /*
     * Gets a number between 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
    	int digits=0;
    	do{
    		System.out.print("Enter an integer >=1 and <=10: ");
    		digits=scr.nextInt();
    	}while(digits<1 || digits>10);
		return digits;
    	
        //TODO Write code to get a number in the range of 1 to 10
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt

    }
	
	
	public static void main(String[] args) {
		DoWhileRange myInt = new DoWhileRange();
		System.out.println(myInt.getValidInput());

	}

}
