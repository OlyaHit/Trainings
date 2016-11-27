package trainingsStart;

import java.util.Scanner;

public class AtleastOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of candies: ");
		int candies = scanner.nextInt();
		do{
			if(candies == 0){
				System.out.println("candy 1");
			}else{
			System.out.println("candy " + candies);
			candies--;
			}
		}while(candies>0);
		 
	}
}
