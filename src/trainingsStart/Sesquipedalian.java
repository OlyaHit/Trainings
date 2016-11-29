package trainingsStart;

import java.util.Scanner;

public class Sesquipedalian {

	public int wordLength(String word) {
	 return word.length();
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = scanner.nextLine();
		System.out.println("Output: ");
		
		Sesquipedalian sesquipedalian = new Sesquipedalian();
		System.out.println(sesquipedalian.wordLength(word));
	}
}
