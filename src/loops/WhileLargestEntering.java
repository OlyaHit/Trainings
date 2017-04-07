package loops;

import java.util.Scanner;

public class WhileLargestEntering {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values, Q to quit: ");
        double largest = in.nextDouble();
        while (in.hasNextDouble()) //supply condition here
        {
            double input = in.nextDouble();
            if (input>largest) // and here
            {
                largest=input;
            }
        }
        System.out.println("Largest value: " + largest);
    }

}
