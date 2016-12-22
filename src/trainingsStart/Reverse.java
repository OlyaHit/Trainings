package trainingsStart;

public class Reverse {
	public static void main(String args[]){
	int num =18953;
	int reverseNum = 0;
	
	//While Loop: Logic to find out the reverse number
	
    while( num != 0 )
    {
    	reverseNum = reverseNum * 10;
    	reverseNum = reverseNum + num%10;
        num = num/10;
    }

    System.out.println("Reverse of input number is: "+reverseNum);
    //http://beginnersbook.com/2014/01/java-program-to-reverse-a-number/
}
}