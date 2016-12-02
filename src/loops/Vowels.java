package loops;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.println("¬ведите слово");
		Scanner scn = new Scanner(System.in);
		String word = scn.nextLine().toLowerCase();
		
		int counterV = 0;
		int counterElse =0;
		for (int i =0; i<word.length();i++){
			String letter = word.substring(i, i+1);
			if("aeiou".contains(letter)){
				counterV++;
			}else{
				counterElse++;
			}
		}
		System.out.println(counterV + " vowels " + counterElse + " other" );
	}

}
