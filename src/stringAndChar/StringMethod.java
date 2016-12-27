package stringAndChar;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		char[] helloArray = { '�', '�', '�', '�', '�', '�', '.'};
	      String helloString = new String(helloArray);  
	      System.out.println(helloString);
	      
	      String str1="���� ����� - ";
	      String str2="����";
	      String str5 ="����";
	      String str6="����";
	      String str4 = "� ���� ������� �������������!";
	      
	      String str3= str1.concat(str2);
	      System.out.println(str3);
	      
	      char result1 = str2.charAt(0);
	      System.out.println("0 ������ ������ - " + result1);
	      
	      //compareTo ����� ���������� ������ 0
	      //������ 0, ���� �������� �������� ������� ���������� �������, ��� ������������ ������; 
	     // ������ 0, ���� �������� �������� ������� ���������� ������� ���� ������.

	      int result = str2.compareTo(str4);
	      System.out.println(result);
	      
	      int result2 = str2.compareToIgnoreCase(str6);
	      System.out.println(result2);
	      
	      String s = "� ����� �������������!";
	      s = s.concat(" ����� ������� �������������!");
	      System.out.println(s);
	      // ��������� ������ �������� ��� - http://proglang.su/java/107
	      
	      
	        
	        String Str5 = new String("����� ���������� �� ProgLang.su");

	        System.out.print("������������ ��������: ");
	        System.out.println(Str5.subSequence(0, 10));
	        System.out.println(Str5.substring(5, 15));
	        
	      //����������� ������ � ������ char'��
	        String string = "12345";
	        char[] chArray = string.toCharArray();
	        System.out.println("������ � ������ ��������: " + Arrays.toString(chArray));
	        
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
