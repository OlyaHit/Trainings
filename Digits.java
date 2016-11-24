package trainings;

public class Digits {

	public static void main(String[] args) {
		//Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
		int a,b,c,d;
		a=4;
		b=12;
		c=3;
		d=3;
		int min =a; int max=a; int num=0;
			
	if (b<min) {
		min = b;
	}
	if(c<min){
		min=c;
	}
	if(d<min){
		min=d;
	}
	System.out.println(min);

	if(b==min){
		num++;
	} if(c==min){
		num++;
	}if(d==min){
		num++;
	}if(a==min){
		num++;
	}
	System.out.println(num);
	}	
}
