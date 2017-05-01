package stringAndChar;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String Str = new String("�����-����������-��-ProgLang.su");
	      String Str2 = new String("��������� ��� ������ �� �����");
	      String line = "��� ������������ ����� split";
	      String digits = "12 345 68 69";
	      
	      String[] words = digits.split("\\s+");
	      String[] twoWords = line.split(" ", 2);
	      System.out.println("���������� �����������: " + Arrays.toString(words));
	      System.out.println("��������� �� 2 ������: " + Arrays.toString(twoWords));
	      
	      
	      
	      System.out.println("������������ ��������: ");
	        for (String retval : Str.split("-", 3)) {
	            System.out.println(retval);
	        }
	        
	        for (String retval2 : Str2.split(" ")) {
	            System.out.println(retval2);
	        }

	}

}
