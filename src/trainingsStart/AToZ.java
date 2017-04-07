package trainingsStart;

//Вывести алфавит от A-Z по 6 шт. в строку

public class AToZ {

	public static void main(String[] args) {
		int numb =0;
		
		for (char ch='A';ch<='Z';ch++){
			if(numb==6){
				System.out.println();
				numb=0;
			}
			System.out.print(ch+ " ");
			numb++;
		}
	}

}
