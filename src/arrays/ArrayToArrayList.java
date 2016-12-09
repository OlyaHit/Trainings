package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//����� �� ������� ������� ����� ��������, ������� �������� Array � ArrayList
public class ArrayToArrayList {

	public static void main(String[] args) {
		String [] arrayOfStrings = {"1","2","3","4"};
		List<String> listOfStrings = new ArrayList<String>();
		
		listOfStrings=Arrays.asList(arrayOfStrings);
		System.out.println("���������� ArrayList � ������� ������ Arrays.asList()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
        // �������� ������� � ������� � �����, ��� ������� ����� �������� � � ������.
        arrayOfStrings[0] = "5";
        System.out.println("\n��������� � ������� �������� � �� ArrayList");
        for(String str:listOfStrings){
        	System.out.println(" "+ str );
        }
     // ��� ���� �������� java.lang.UnsupportedOperationException, ������ ���
        // Arrays.asList() ���������� ������ �������������� �������. ���� ������ ������� �� ������� ��������� �������
        //listOfStrings.add("5");
        listOfStrings= new ArrayList<String>();
        Collections.addAll(listOfStrings, arrayOfStrings);
     // �������� � ������, � ArrayList ��� �������� �� ����������������� ���������?
        listOfStrings.add("5");
        arrayOfStrings[0] = "1";
        System.out.println("\nArray � ArrayList � ������� ������ Collections.addAll()");
        for (String str : listOfStrings)
            System.out.print(" " + str);
        
        
        
	}

}
