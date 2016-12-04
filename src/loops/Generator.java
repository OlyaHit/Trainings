package loops;

import java.util.Random;

public class Generator {

	public static void main(String[] args) {
		Random generator = new Random(42);
		int counterSix =0;
		
		for (int i=0; i<100;i++){
			int value=generator.nextInt(6)+1;
			if(value==6){
				counterSix++;
			}
		}
		System.out.println(counterSix);
	}

}
