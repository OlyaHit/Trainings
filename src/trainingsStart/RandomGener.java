package trainingsStart;
import java.util.Random;

public class RandomGener {

	public static void main(String[] args) {
		//������� ���������, ��������� �� ����� �������� ��������������� ���������� ����������� ����� � ��� ���������� �����.
	
		Random rnd=new Random();
        int a= (int)rnd.nextInt(899)+100;
        int b=a%10;
        int c=(a/10)%10;
        int d=(a/100)%10;
        if(b>=c&b>d||b>c&b>=d){
            System.out.println("� ����� "+a+" ���������� ����� " +b);
        }
        else {
            if (c>b&c>=d) {
                System.out.println("� ����� "+a+" ���������� ����� " +c);
            }
            else {
                System.out.println("� ����� "+a+" ���������� ����� " +d);
            }
        }		
		
		
		
	}

}
