package loops;

public class CreditCard {
	private long cardNumber;

    public CreditCard(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }
	
    public int sumCertainDigits()
    {
        long n = cardNumber;
        
        // TODO this is the code from the a previous video. You can use it
        // as a starting point, but you will need to change a lot.
        // Change this method so that it will calculate the sum of every
        // second digit instead of all the digits, and then return this 
        // special sum. 
        // for example, if n is 12345, this method should return the sum 
        // 5 + 3 + 1
        // There are links to videos with hints above the submit button. 
        // Use them if you want more inspiration.
        int sum = 0;
        int count=0;
        
        while (n > 0)
        {
        	count++;
            int digit = (int)(n % 10); 
            if(count % 2 == 1){
            	sum = sum + digit;
            }
            n = n/10;	
        }
		return sum;

    }
    
	public static void main(String[] args) {
	CreditCard credit = new CreditCard(411454L);
	System.out.println(credit.sumCertainDigits());
	}

}
