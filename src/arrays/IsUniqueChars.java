package arrays;
//Алгоритм, определяющий, все ли символы в строке встречаются один раз. 256 символов в алфавите
//Если вы «наткнетесь» на этот же символ во второй раз, можете сразу возвращать false.


public class IsUniqueChars {

	public boolean isUniqueChars2(String str) {
	    boolean[] char_set = new boolean[256];
	    for (int i = 0; i < str.length(); i++) {
	        int val = str.charAt(i);
	        if (char_set[val]) {        //символ уже был найден в строке
	            return false;
	        }
	        char_set[val] = true;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		IsUniqueChars unique = new IsUniqueChars();
		System.out.println(unique.isUniqueChars2("TYUTY"));
		
	}

}
