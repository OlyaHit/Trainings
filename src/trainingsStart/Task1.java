package trainingsStart;

import java.util.ArrayList;
import java.util.List;

//������������ ������ ����� �����. ���� ����� ������, �� � ���� ��������� 2, � ���� ��������, �� 1.
//�� ������������ ������� "����" (if).
public class Task1 {

	public static void main(String[] args) {
		
		List<Object> newList = new ArrayList<Object>();
		int digit = 10;
		int result = digit%2 == 0 ? digit+2 : digit+1; 
		System.out.println( result  );
		
	//���� ����������� ����� � (� > 999). �����:
			//�) ����� ����� � ���;
			//�) ����� ����� � ���.
		int nat=7536, one,  dec,  hun, taus,  rez;  
	      one=nat%10;   
	      dec=(nat/10)%10;   
	      hun=(nat/100)%10;   
	      taus=nat/1000;  
	      rez=taus*1000+hun*100+dec*10+one;   
	      System.out.println("����� ������ �����="+one) ;  
	      System.out.println("����� �������� �����="+dec) ;  
	       System.out.println("����� ����� �����="+hun );  
	       System.out.println("����� ����� �����="+taus );  
	      System.out.println("�������� �����="+rez) ;  
	      
//� ���������� n �������� ������������ ����� � ��������� ������� ������. 
//�������� ���������, ����������� ����� n �� ���������� ������ � ��������� ��������� �� �����.
double w =5.53;
double x = Math.round(w);
System.out.println(x); 
	}

}
