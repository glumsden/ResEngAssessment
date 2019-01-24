import java.util.*;
public class elven
{
  public static void main(String[] args)
  {
    
    String patchText = ("108835|04|Feb/06/03|R|S|O| |8|sparc;108827-30;|SUNWdtdst:1.4,REV=10.1999.12.02;SUNWdtdmn:1.4,REV=10.1999.12.02;|Obsoleted by: 108835-05 CDE 1.4: dtcm patch"); //set the patch info as a String
	StringTokenizer st = new StringTokenizer(patchText, "|"); //instantiate a StringTokenizer, pass the patch info string and delimit using the | character
	int numTokens = st.countTokens();
	System.out.println("The Number of Tokens is: " + numTokens);
	String[] strArr = new String[numTokens]; //create an array for the tokens large enough to accommodate the number of tokens
	int count = 0;
    while (st.hasMoreTokens()) //While StringTokenizer has more tokens keep adding them to the Array
	{
		strArr[count] = st.nextToken();
		count++;
    }
	for(int i = 0; i < strArr.length; i++) //Print out the tokens 
	{
		System.out.println(strArr[i]);
	}
  }
}
