package stringAndChar;

public class CharMethod {

	public static void main(String[] args) {
		System.out.println("�������� \"p\" �����? �����: " + Character.isLetter('p'));
		System.out.println("�������� \"1\" �����? �����: " + Character.isDigit('1'));
		System.out.println("�������� \" \" (������) ������ ������������? �����: " + Character.isWhitespace(' '));
		System.out.println("�������� \"P\" � ������� ��������? �����: " + Character.isUpperCase('P'));
		System.out.println("�������� \"p\" � ������ ��������? �����: " + Character.isLowerCase('p'));
		System.out.println("�������� \"i\" � ������� ��������: " + Character.toUpperCase('i'));
		System.out.println("�������� \"R\" � ������ ��������: " + Character.toLowerCase('R'));
		System.out.println("�������� \"" + Character.toString('P') + "\" ������ ��������� ������.");
	}

}
