package arrays;

public class MassPalindrom {

	public static void main(String[] args) {

		/*2) ђектор палиндром
	Написать класс с методом определ§ющий, §вл§етс§ ли массив палиндромом (одинаково читаетс§ и справа и слева)
	Њример палиндрома: 1234321
	їм§ метода: isVectorPalindrom*/	
		
		int [] array= {1,2,3,4,3,2,1};
		String ourString = "MAMtAM";
		isVectorPalindrom(array);
		System.out.println(isVectorPalindrom(array));
		System.out.println(isStringPalindrom(ourString));
	}

	public static boolean isVectorPalindrom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1-i]) {
                return false;
            }
        }
        return true;
      
    }
	public static boolean isStringPalindrom(String ourString){
		String newString = ourString;
		for (int i=0; i<newString.length(); i++){
			if(newString.charAt(i)!=newString.charAt(newString.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}
