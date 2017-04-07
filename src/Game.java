import java.util.Scanner;

public class Game {
	 public static void main(String[] args) {
	        // prog � ����� ��������� ����������
	        // user � ����� �������� �������������
	        int prog, user;
	        int counter = 0;
	        // ���������� ��������� ����� ����� �� 1 �� 10
	        prog = (int)(Math.random() * 10) + 1;
	        System.out.println("� �������� ����� �� 1 �� 10, ��������� ���.");
	        System.out.print("������� ���� �����: ");
	        Scanner input = new Scanner(System.in);  
	        // ���������, ���� �� � ������ ����� ����� �����
	        if( input.hasNextInt() ) {
	            do {
	                // ������ � ������ ����� ����� �����
	                user = input.nextInt();
	                counter++;
	                if(user == prog) {
	                    System.out.println("�� �������!");
	                } else {
	                    // ���������, ������ �� ����� � ������� [1;10]
	                    if (user > 0 && user <= 10) {
	                        System.out.print("�� �� �������! ");
	                        // ���� ����� ���������� ���������� ������...
	                        if( prog < user ) {
	                            System.out.println("�� ����� ������.");
	                        } else {
	                            System.out.println("�� ����� ������.");
	                        }
	                    } else {
	                        System.out.println("���� ����� ������ �� �� ������� �������!");
	                    }
	                }
	            } while( user != prog );
	        } else {
	            System.out.println("������. �� �� ����� ����� �����!");
	        }
	        
	        System.out.println("�� ��������!" + counter);
	    }
}
