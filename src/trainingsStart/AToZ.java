package trainingsStart;

//������� ������� �� A-Z �� 6 ��. � ������

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
