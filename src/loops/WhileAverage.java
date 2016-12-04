package loops;
import java.util.Scanner;

public class WhileAverage {
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        double value;
		        int count = 0;
		        double sum = 0;
		        boolean done = false;

		        while (!done)
		        {
		            System.out.print("Enter a value, 0 to quit: ");
		            value = in.nextDouble();
		            if (value != 0)
		            {
		                sum = sum + value;
		                count++;
		            }
		            else
		            {
		                done = true;

		            }
		        }
		        double average = sum / count;
		        System.out.printf("Average: %.2f\n", average);
		    }

}
