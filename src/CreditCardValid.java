
// нечетные цифры карты сум+цифра, четные цифра меньше 5 - сумм+2*цифру, 5 и больше - сумма +2*цифру-9
public class CreditCardValid
{
    private long cardNumber;

    public CreditCardValid(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * Calculates whether this CreditCard has a valid number.
     * @return true if the number is valid, false if it's not.
     */
    public boolean isValid()
    {
        long n = cardNumber;
        int sum = 0;
        int count=0;
        
        while (n > 0)
        {
        	count++;
            int digit = (int)(n % 10); 
            if(count % 2 == 1){
            	sum = sum + digit;
            } else if (digit < 5){
            	sum = sum + 2 * digit;
            }else
            { sum = sum + 2 * digit - 9;}
            n = n/10;	
        }
   
        return sum %10 == 0;
    }
}