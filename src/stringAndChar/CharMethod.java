package stringAndChar;

public class CharMethod {

	public static void main(String[] args) {
		System.out.println("Значение \"p\" буква? Ответ: " + Character.isLetter('p'));
		System.out.println("Значение \"1\" цифра? Ответ: " + Character.isDigit('1'));
		System.out.println("Значение \" \" (пробел) пустое пространство? Ответ: " + Character.isWhitespace(' '));
		System.out.println("Значение \"P\" в верхнем регистре? Ответ: " + Character.isUpperCase('P'));
		System.out.println("Значение \"p\" в нижнем регистре? Ответ: " + Character.isLowerCase('p'));
		System.out.println("Значение \"i\" в верхнем регистре: " + Character.toUpperCase('i'));
		System.out.println("Значение \"R\" в нижнем регистре: " + Character.toLowerCase('R'));
		System.out.println("Значение \"" + Character.toString('P') + "\" теперь строковый объект.");
	}

}
