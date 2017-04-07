package loops;

import java.util.Scanner;

public class ValidationImput {

	public static void main(String[] args) {
	 Scanner scr = new Scanner(System.in);
	 int value;
//	 do {
//		 System.out.println("enter value less then 100");
//		 value = scr.nextInt();
//	 }while(value >= 100);
//	 
//	 System.out.println("your value is: " + value);
	 
	 do
     {
         System.out.print("Enter an integer < 100: ");
         value = scr.nextInt();
     }
     while (value<0 || value >= 100);

     System.out.println("Thank you for entering " + value);

	}

}
