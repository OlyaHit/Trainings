package loops;

import java.util.Random;

public class Generator {

	public static void main(String[] args) {
		//1
		Random generator = new Random(42);
		int counterSix =0;
		
		for (int i=0; i<100;i++){
			int value=generator.nextInt(6)+1;
			if(value==6){
				counterSix++;
			}
		}
		System.out.println(counterSix);
	//2
	int x= generator.nextInt(10);
	System.out.println(x);
	//3
	int j=generator.nextInt(10)+1;
	//4
	double db=generator.nextDouble()*100;
	System.out.println(db);
	
	
	}
}
