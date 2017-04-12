package qr2017.TidyNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TidyNumbers 
{
	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			findTidyNumber(i);
			System.out.println();
		 }
	}
	public static void findTidyNumber(int caseNo)
	{
		//long nn=sc.nextLong();
		String n=sc.next();
		int len=n.length();
		if(len>1)
		{
			n=makeItTidy(n,0);
		}
		System.out.print("Case #"+caseNo+": "+Long.parseLong(n));
		
	}
	private static String makeItTidy(String n,int si) 
	{
		// TODO Auto-generated method stub
		if(si<0)
			return n;
		int len=n.length();
		char c,ch;
		for(int i=si;i<len-1;i++)
		{
			c=n.charAt(i);
			ch=n.charAt(i+1);
			if(c>ch)
			{
				n=makeItTidy((n.substring(0,i)+ --c), i-1)+ getStringof9(i+1,len);
				//return n;
				break;
			}
		}
		return n;
			
			
	}
	private static String getStringof9(int j, int len) 
	{
		// TODO Auto-generated method stub
	    int c=len-j;
	    String s="";
	    for(int i=0;i<c;i++)
		{
	    	s+="9";
		}
		return s;
	}
}
