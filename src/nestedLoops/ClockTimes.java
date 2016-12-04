package nestedLoops;

public class ClockTimes
{
    public static void main(String[] args)
    {
        for (int minute = 0; minute <= 59; minute++)
        {
           for(int hours=1;hours<=12; hours++ ){
        	   System.out.printf("%d:%02d ", hours,minute);
           }
           System.out.println();
        }
       
    }
}
