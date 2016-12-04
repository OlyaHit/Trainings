package loops;

import java.util.Random;

public class DiceGame
{
    Random generator = new Random(45);
   
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
    	boolean win=false;
    	for(int i=0;i<4;i++){
    		int value=generator.nextInt(6)+1;
    		if(value==6){
    			win=true;
    		}
    	}
		return win;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
    	boolean win=false;
        for(int i=0;i<24;i++){
        	int value1=generator.nextInt(6)+1;	
        	int value2=generator.nextInt(6)+1;
        	if(value1==6&&value2==6){
        		win=true;
        	}
        }
		return win;
    }
	public static void main(String[] args) {
		DiceGame diceGame = new DiceGame();
		System.out.println(diceGame.game1());
		System.out.println(diceGame.game2());
	}

}
