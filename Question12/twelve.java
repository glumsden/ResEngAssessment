import java.util.*;
import java.util.Scanner;
public class twelve
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
	calendar.clear();
	//calendar.set(2000, Calendar.APRIL, 26);
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter the year: ");
	int year = reader.nextInt();
	
	System.out.println("Enter the month in format ## (eg: January = 01): ");
	int month = reader.nextInt();
	month--;
	
	System.out.println("Enter the day: ");
	int day = reader.nextInt();	
	
	calendar.set(year, month, day);
	
	long secondsSinceEpoch = calendar.getTimeInMillis() / 1000L;
	System.out.println(secondsSinceEpoch);
  }
}