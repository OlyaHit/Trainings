package trainingsStart;
//����� ���������, �������� �� ����� �� ���� ����, �������� �������������, ����������� �����
//hrtyu
import java.util.Scanner;
public class PalindromString {
	public static void main(String[] args){
	 System.out.println("������� ����� �� ���� ����: ");
      Scanner scn=new Scanner(System.in);
      if (scn.hasNextLine()){
    	  String s =scn.nextLine().toLowerCase();
          if (s.length()==5){
        	  if(s.charAt(0)==s.charAt(4)&&s.charAt(1)==s.charAt(3)){
        		  System.out.println("����� ���������");
        	  }else System.out.println("����� �� ���������");
      }else {
    	  System.out.println("�� ��������. ��� ���������� ������ ����� �� ���� ����!"); 
      } 
      }
      else {
    	  System.out.println("�� ����� �� �����!"); 
      }
	}
	
}
