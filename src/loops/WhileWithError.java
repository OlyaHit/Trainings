package loops;

import java.util.Scanner;

public class WhileWithError {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        System.out.print("Enter a value ");
        
        if(scr.hasNextDouble()){
        	while(scr.hasNextDouble()){
        		double value = scr.nextDouble();
        		count++;
        		sum=sum+value;
        		System.out.print("Enter a value, Q to quit: ");
        	}
        	double averega = sum/count;
        	System.out.print("Avr: " + averega);
        }else{
        	System.out.print("Error NO IPUT");
        }
        
	}

}
