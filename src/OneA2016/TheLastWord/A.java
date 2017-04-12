package OneA2016.TheLastWord;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			logic(i);
			System.out.println();
		 }
	}
	private static void logic(int caseNo) 
	{
	  String string=sc.next(),oString="";
	  int len=string.length();
	  char ch=string.charAt(0);
	  oString+=ch;
	  for(int  i=1;i<len;i++)
	  {
		ch=string.charAt(i);
		if(ch>=oString.charAt(0))
		{
			oString=ch+oString;
		}
		else
		{
			oString=oString+ch;
		}
	  }
	  System.out.print("Case #"+caseNo+": "+oString);
	}
}
