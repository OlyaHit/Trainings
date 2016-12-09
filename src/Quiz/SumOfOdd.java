package Quiz;

public class SumOfOdd {
	
	public int sumOdds(int number){
		int sumOdds=0;
		while(number>0){
		int digit = (int)number%10;
		if(digit%2==1){
			sumOdds=sumOdds+digit;
		}
		number =number/10;
		}
		return sumOdds ;
		
	}
	
	

	public static void main(String[] args) {
		SumOfOdd sumOdd = new SumOfOdd();
		System.out.println(sumOdd.sumOdds(153462));
	}

}
