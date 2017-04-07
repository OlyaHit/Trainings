package arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	 /**
     * � ���� ������ ������������������ ������ ��� ����������� �������� �� java
     * @param args
     */
    public static void main(String[] args) {
        int[] source = {1,2,3,4,5,6,7,8,9};
        int[] source1 = {1,2,3};
        int[] destination=null;
        System.out.println("������-�������� = " + Arrays.toString(source));
         
        destination = copyFirstFiveFieldsOfArrayUsingSystem(source);
        System.out.println("�������� ������ 5 ��������� �������, ���� ��� ������������. �������������� ������ = " + Arrays.toString(destination));
         
        destination = copyFirstFiveFieldsOfArrayUsingSystem(source1);
        System.out.println("�������� ������ 5 ��������� �������, ���� ��� ������������. �������������� ������ = " + Arrays.toString(destination));
         
        destination = copyFullArrayUsingSystem(source);
        System.out.println("������ ����������� ������� � ������� ������ System.copyarray(). �������������� ������ = " + Arrays.toString(destination));
         
        destination = copyFullArrayUsingClone(source);
        System.out.println("������ ����������� ������� � ������� ������ clone(). �������������� ������ = " + Arrays.toString(destination));
         
        destination = copyFullArrayUsingArrayCopyOf(source);
        System.out.println("������ ����������� ������� � ������� ������ Arrays.copyOf(). �������������� ������ = " + Arrays.toString(destination));
         
        destination = copyLastThreeUsingArrayCopyOfRange(source);
        System.out.println("�������� ��������� 3 �������� ������� � ������. ������ Arrays.copyOfRange(). �������������� ������ = " + Arrays.toString(destination));
    }
 
    /**
     * ���� ����� ��������� �������� ������ ��������� ����� Arrays.copyOf()
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingArrayCopyOf(int[] source) {
        return Arrays.copyOf(source, source.length);
    }
     
    /**
     * ���� ����� �������� ��������� 3 �������� ��������� �����
     * Arrays.copyOfRange() 
     * @param source
     * @return
     */
    private static int[] copyLastThreeUsingArrayCopyOfRange(int[] source) {
        // ��������� ����� ��� ��������������� java.lang.ArrayIndexOutOfBoundsException
        //�� ��� �������� ������ ����� �� ������ :)
        return Arrays.copyOfRange(source, source.length-3, source.length);
    }
 
    /**
     * ���� ����� ��������� �������� ������ � ������� ������ clone() 
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingClone(int[] source) {
        return source.clone();
    }
 
    /**
     * ���� ����� ��������� �������� ������ � ������� ������ System.arraycopy() 
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingSystem(int[] source) {
        int[] temp=new int[source.length];
        System.arraycopy(source, 0, temp, 0, source.length);
        return temp;
    }
 
    /**
     * ���� ����� �������� ������ 5 ��������� 
     * ��������� ����� System.arraycopy()
     * @param source
     * @return
     */
    private static int[] copyFirstFiveFieldsOfArrayUsingSystem(int[] source) {
        if(source.length > 5){
            int[] temp=new int[5];
            System.arraycopy(source, 0, temp, 0, 5);
            return temp;
        }else{
            int[] temp=new int[1];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        }
         
    }
 
}
