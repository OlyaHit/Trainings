
//Quiz: Know when to quit
//You need to modify the function int martingale() by adding an extra if block that checks if the money value has reached or exceeded the target specified if(money >= target). If it has, then the code should break out of the while loop using the break; statement
public class PlayGame {
	
	public int martingale() {
		 int money = 1000;
		 int target = 1200;
		 int bet = 10;
		 while (money > bet) {
		  boolean win = play();
		  if (win) {
		   money += bet;
		   bet = 10;
		  } else {
		   money -= bet;
		   bet *= 2;
		  }
		  
		  if(money >= target){
			 break; 
		 }
		 }
		 return money;
		}

	private boolean play() {
		// TODO Auto-generated method stub
		return false;
	}

}
