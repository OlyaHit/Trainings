package trainingsStart;
//будет проверять, является ли слово из пяти букв, введённое пользователем, палиндромом мором
//hrtyu
import java.util.Scanner;
public class PalindromString {
	public static void main(String[] args){
	 System.out.println("Введите слово из пяти букв: ");
      Scanner scn=new Scanner(System.in);
      if (scn.hasNextLine()){
    	  String s =scn.nextLine().toLowerCase();
          if (s.length()==5){
        	  if(s.charAt(0)==s.charAt(4)&&s.charAt(1)==s.charAt(3)){
        		  System.out.println("Слово палиндром");
        	  }else System.out.println("Слово не палиндром");
      }else {
    	  System.out.println("Вы ошиблись. Вам необходимо ввести слово из пяти букв!"); 
      } 
      }
      else {
    	  System.out.println("Вы ввели не слово!"); 
      }
	}
	
}
