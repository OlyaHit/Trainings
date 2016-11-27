package trainingsStart;

import java.util.Scanner;

public class SpendMoney {
	public static void main(String[] args) {
//			 int startNum;   
//			 Scanner scanner =new Scanner(System.in);   
//			 System.out.println("Enter the number:");   
//			 startNum=scanner.nextInt();   
//			 for(int i=startNum; i>0;i--){
//			   System.out.println(i); 
//			}
		
	int i,lo=1,hi=3,result=0;     
	 Scanner scanner =new Scanner(System.in);     
	 System.out.println("Enter the lower limit:");     
	 lo=scanner.nextInt();     
	 System.out.println("Enter the upper limit:");     
	 hi=scanner.nextInt();
	 
	for(i=lo;i<=hi;i++){
		result=lo+hi;
	     }
		     
		System.out.println("Result:"+result);     
		   
	}
}

