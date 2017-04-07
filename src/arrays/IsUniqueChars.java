package arrays;
//��������, ������������, ��� �� ������� � ������ ����������� ���� ���. 256 �������� � ��������
//���� �� ������������ �� ���� �� ������ �� ������ ���, ������ ����� ���������� false.


public class IsUniqueChars {

//	public boolean isUniqueChars2(String str) {
//	    boolean[] char_set = new boolean[256];
//	    for (int i = 0; i < str.length(); i++) {
//	        int val = str.charAt(i);
//	        if (char_set[val]) {        //������ ��� ��� ������ � ������
//	            return false;
//	        }
//	        char_set[val] = true;
//	    }
//	    return true;
//	}

    /**
 
     * @return true - ��� ������� ��������� false - ���� ������������� �������
     */
    public  boolean isAllCharUnique(String input) {
        int length = input.length();
        if (length > 256) {
            return false;
        }
       
        for (int i = 0; i < length; i++) {
            Character symbol = input.charAt(i);
            for (int j = i + 1; j < length; j++) {
                if (symbol == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		IsUniqueChars unique = new IsUniqueChars();
		System.out.println(unique.isAllCharUnique("KKlUTY"));
		
	}

}
