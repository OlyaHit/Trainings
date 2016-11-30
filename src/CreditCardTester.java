
public class CreditCardTester {

	public static void main(String[] args) {
		CreditCardValid validCard = new CreditCardValid(4417123456789113L);
        System.out.println("Actual: " + validCard.isValid());
        System.out.println("Expected: true");

        CreditCardValid invalidCard = new CreditCardValid(4417123456879113L);
        System.out.println("Actual: " + invalidCard.isValid());
        System.out.println("Expected: false");

        CreditCardValid easyToRememberValidCard = new CreditCardValid(4111111111111111L);
        System.out.println("Actual: " + easyToRememberValidCard.isValid());
        System.out.println("Expected: true");
	}

}
