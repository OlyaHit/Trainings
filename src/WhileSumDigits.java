
public class WhileSumDigits {

	public static void main(String[] args) {
		int digits = 4555;
		int sum=0;
		
		while (digits>0){
			int number = digits%10;
			sum=sum+number;
			digits = digits/10;
		}
		System.out.println(sum);
	}

}
