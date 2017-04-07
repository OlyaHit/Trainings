package trainsVideo;

public class MassPalindrom {

	public static void main(String[] args) {

		/*
		 * 2) ¬ектор палиндром Ќаписать класс с методом определ€ющий, €вл€етс€
		 * ли массив палиндромом (одинаково читаетс€ и справа и слева) ѕример
		 * палиндрома: 1234321 »м€ метода: isVectorPalindrom
		 */
		int number = 1234521;
		int[] array = { 1, 2, 3, 4, 3, 2, 1 };
		isNumberPalindrom(number);
		System.out.println(isVectorPalindrom(array));

		String str = "MADdsAM";
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstring += str.charAt(i);
		}

		// System.out.println(revstring);

		if (revstring.equalsIgnoreCase(str)) {
			System.out.println("The string is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static boolean isVectorPalindrom(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length - i - 1]) {
				return false;
			}
		}
		return true;

	}

	public static void isNumberPalindrom(int numbers) {
		int digits =numbers;
		int temp = 0;
		int reversedNumber = 0;
		while (digits > 0) {
			reversedNumber =reversedNumber*10; 
			reversedNumber += digits % 10;
			digits = digits / 10;
		}
		if (numbers == reversedNumber) {
			System.out.println(numbers + " is a palindrome number");
		} else
			System.out.println(numbers + " is not a palindrome number");
	}
}
