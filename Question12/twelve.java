import java.util.*;
import java.util.Scanner;
public class twelve
{
  public static void main(String[] args)
  {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC")); //instantiate a Calendar object in UTC format
	calendar.clear();
	Scanner reader = new Scanner(System.in); Scanner to allow us read in form command line
	
	System.out.println("Enter the year: "); //request year
	int year = reader.nextInt(); //read it in int format
	
	System.out.println("Enter the month in format ## (eg: January = 01): "); //request month in particular format. Could possibly add validation here
	int month = reader.nextInt(); //read it in int format
	month--; //minus 1 from what user entered since month starts at index 0 and not 1
	
	System.out.println("Enter the day: "); //request day
	int day = reader.nextInt();	//read it in int format
	
	calendar.set(year, month, day); //set the date in calendar
	
	long secondsSinceEpoch = calendar.getTimeInMillis() / 1000L; //instantiate long called secondsSinceEpoch with the number of milliseconds since epoch (which is what the mothod .getTimeInMillis does) and divide by 1000 to get it in seconds.
	System.out.println(secondsSinceEpoch); //print out the results
  }
}