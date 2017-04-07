import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
public class DateTesting {
	
	 private static String getCurrentDay (){
	        //Create a Calendar Object
	        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

	        //Get Current Day as a number
	        int todayInt = calendar.get(Calendar.DAY_OF_MONTH)+3;
	        System.out.println("Today Int: " + todayInt +"\n");

	        //Integer to String Conversion
	        String todayStr = Integer.toString(todayInt);
	        System.out.println("Today Str: " + todayStr + "\n");

	        return todayStr;
	    }
	
	public static void main(String[] args) {
	   String today = getCurrentDay();
	   System.out.println(today);
	   
	   //get current date time with Date()
	  Date date = new Date();
	   
	   // Create object of SimpleDateFormat class and decide the format
	  DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	   
	   // Now format the date
	   String date1= dateFormat.format(date);
	   
	   // Print the Date
	   System.out.println(date1);
	}

}
