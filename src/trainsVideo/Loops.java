package trainsVideo;

public class Loops {

	public static void reversedNumber(int number) {
		int reversedN = 0;
		while (number != 0) {
			reversedN = reversedN * 10;
			reversedN += number % 10;
			number = number / 10;
		}
		System.out.println(reversedN);
	}

	public static void primeNumber(int num) {
		boolean isPrime= true;
		for (int i = 2; i <num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime){
			System.out.println(num + " is Prime Number");
		} else{
			System.out.println(num + " is not Prime Number");
	}

}

	public static void main(String[] args) {
		int ourNumber = 1458678;
		int prime = 2;
		reversedNumber(ourNumber);
		primeNumber(prime);
	}

}
