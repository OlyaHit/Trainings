package trainingsStart;

import java.util.ArrayList;
import java.util.List;

//Пользователь вводит целое число. Если число чётное, то к нему прибавить 2, а если нечётное, то 1.
//Не использовать условие "если" (if).
public class Task1 {

	public static void main(String[] args) {
		
		List<Object> newList = new ArrayList<Object>();
		int digit = 10;
		int result = digit%2 == 0 ? digit+2 : digit+1; 
		System.out.println( result  );
		
	//Дано натуральное число п (п > 999). Найти:
			//а) число сотен в нем;
			//б) число тысяч в нем.
		int nat=7536, one,  dec,  hun, taus,  rez;  
	      one=nat%10;   
	      dec=(nat/10)%10;   
	      hun=(nat/100)%10;   
	      taus=nat/1000;  
	      rez=taus*1000+hun*100+dec*10+one;   
	      System.out.println("Цифра единиц числа="+one) ;  
	      System.out.println("Цифра десятков числа="+dec) ;  
	       System.out.println("Цифра сотен числа="+hun );  
	       System.out.println("Цифра тысяч числа="+taus );  
	      System.out.println("Проверка числа="+rez) ;  
	      
//В переменной n хранится вещественное число с ненулевой дробной частью. 
//Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
double w =5.53;
double x = Math.round(w);
System.out.println(x); 
	}

}
