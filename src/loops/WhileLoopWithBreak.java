package loops;
import java.util.Scanner;

public class WhileLoopWithBreak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����: ");
		int dice = scan.nextInt();
		
//		while (dice!=6){
//			System.out.println("������� �����: ");
//			dice = scan.nextInt();
//			if (dice==6){
//				System.out.println("WIN");
//				break;
//			}else if(dice==3){
//				System.out.println("LOSE");
//				break;
//			}
//		}
		do{
			System.out.println("������� �����: ");
			dice = scan.nextInt();
			if (dice==6){
				System.out.println("WIN");
				break;
			}else if(dice==3){
				System.out.println("LOSE");
				break;
			}
		}while(dice!=6);
		
	}

}