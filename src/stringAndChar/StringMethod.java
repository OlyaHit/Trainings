package stringAndChar;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		char[] helloArray = { 'ѕ', 'р', 'и', 'в', 'е', 'т', '.'};
	      String helloString = new String(helloArray);  
	      System.out.println(helloString);
	      
	      String str1="мен€ зовут - ";
	      String str2="куз€";
	      String str5 ="куз€";
	      String str6=" уз€";
	      String str4 = "я буду хорошим программистом!";
	      
	      String str3= str1.concat(str2);
	      System.out.println(str3);
	      
	      char result1 = str2.charAt(0);
	      System.out.println("0 символ строки - " + result1);
	      
	      //compareTo равны лексически строки 0
	      //меньше 0, если аргумент €вл€етс€ строкой лексически большей, чем сравниваема€ строка; 
	     // больше 0, если аргумент €вл€етс€ строкой лексически меньшей этой строки.

	      int result = str2.compareTo(str4);
	      System.out.println(result);
	      
	      int result2 = str2.compareToIgnoreCase(str6);
	      System.out.println(result2);
	      
	      String s = "я стану программистом!";
	      s = s.concat(" ќчень хорошим программистом!");
	      System.out.println(s);
	      // остальные методы смотреть тут - http://proglang.su/java/107
	      
	      
	        
	        String Str5 = new String("ƒобро пожаловать на ProgLang.su");

	        System.out.print("¬озвращаемое значение: ");
	        System.out.println(Str5.subSequence(0, 10));
	        System.out.println(Str5.substring(5, 15));
	        
	      //ѕреобразуем строку в массив char'ов
	        String string = "12345";
	        char[] chArray = string.toCharArray();
	        System.out.println("—троку в массив символов: " + Arrays.toString(chArray));
	        
	        char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
	        /**
	         * We can copy a char array to a string by using
	         * copyValueOf() method.
	         */
	        String chStr = String.copyValueOf(ch);
	        System.out.println(chStr);
	        /**
	         * We can also copy only range of charactors in a
	         * char array by copyValueOf() method.
	         */
	        String subStr = String.copyValueOf(ch,3,4);
	        System.out.println(subStr);


	}

}
