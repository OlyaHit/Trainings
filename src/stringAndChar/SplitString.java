package stringAndChar;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String Str = new String("Добро-пожаловать-на-ProgLang.su");
	      String Str2 = new String("Разделяем эту строку на слова");
	      String line = "Как использовать метод split";
	      String digits = "12 345 68 69";
	      
	      String[] words = digits.split("\\s+");
	      String[] twoWords = line.split(" ", 2);
	      System.out.println("Используем разделитель: " + Arrays.toString(words));
	      System.out.println("Разделяем на 2 строки: " + Arrays.toString(twoWords));
	      
	      
	      
	      System.out.println("Возвращаемое значение: ");
	        for (String retval : Str.split("-", 3)) {
	            System.out.println(retval);
	        }
	        
	        for (String retval2 : Str2.split(" ")) {
	            System.out.println(retval2);
	        }

	}

}
