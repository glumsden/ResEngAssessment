import java.util.*;
public class elven
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    //String myObject = ("Hello World!");
    //System.out.print(myObject);
    
    String patchText = ("108835|04|Feb/06/03|R|S|O| |8|sparc;108827-30;|SUNWdtdst:1.4,REV=10.1999.12.02;SUNWdtdmn:1.4,REV=10.1999.12.02;|Obsoleted by: 108835-05 CDE 1.4: dtcm patch");
	StringTokenizer st = new StringTokenizer(patchText, "|");
	int numTokens = st.countTokens();
	System.out.println("The Number of Tokens is: " + numTokens);
	String[] strArr = new String[numTokens];
	int count = 0;
    while (st.hasMoreTokens()) 
	{
		//System.out.println(st.nextToken());
		strArr[count] = st.nextToken();
		count++;
    }
	for(int i = 0; i < strArr.length; i++)
	{
		System.out.println(strArr[i]);
	}
  }
}
