package loops;

public class WhileNumberToMatch {
	    private long number;

	    public WhileNumberToMatch (long number)
	    {
	        this.number = number;
	    }

	    /**
	     * Returns the number of times digitToMatch appears
	     * in this number.
	     * @param digitToMatch the digit to search for.
	     *   must be at least 0 and at most 9.
	     * @return number of occurrences of digitToMatch
	     */
	    public int countMatchingDigits(int digitToMatch)
	    {
	        // TODO: count and return the number of times the given digit appears in the number
	        long temp = number;
	        int counter = 0;
	        while(temp>0){
	            int digit = (int)(temp%10);
	            if(digit==digitToMatch){
	                counter++;
	            }
	            temp=temp/10;
	        }
	        return counter;
	        // Hint: The last digit is (int)(numbers % 10).
	    }
	    
	public static void main(String[] args) {
		WhileNumberToMatch numberForCheck = new WhileNumberToMatch(15954564L);
		System.out.println(numberForCheck.countMatchingDigits(5));
	}

}
