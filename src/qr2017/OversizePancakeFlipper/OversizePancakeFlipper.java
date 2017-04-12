package qr2017.OversizePancakeFlipper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OversizePancakeFlipper {

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
		// TODO Auto-generated method stub
		String s=sc.next();
		int k=sc.nextInt();
	    char ch='e';
	    long tk=k,fc=0,len=s.length();
	    boolean flag=true,fillFlipper=false;
	    for(int i=0;i<len;i++)
	    {
	    	ch=s.charAt(i);
	    	if(!fillFlipper && ch=='-')
	    	{
	    		flag=false;
	    		fillFlipper=true;
	    	}
	    	if(fillFlipper)
	    	{
	    		tk--;
	    		if(tk==0)
	    		{
	    		 fc++;
	    		 s=(((i-k)>=0)?s.substring(0,i-k+1):"")+ flipCakes(s.substring(i-k +1,i+1))+ ((i<len-1)?s.substring(i+1):"");
	    		 tk=k;
	    		 fillFlipper=false;
	    		 i=i-k+1;
	    		}
	    	}
	    	/*
	    	if(ch=='+')
	    	{
	    		continue;
	    	}*/
	    }
	    
	    
	    if(!flag && !checkAllPankCakesAreHappy(s))
	    {
	    	System.out.print("Case #"+caseNo+": IMPOSSIBLE");
	    	return ;
	    }	
	    System.out.print("Case #"+caseNo+": "+fc);
	}
	private static boolean checkAllPankCakesAreHappy(String s) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<s.length();i++)
	    {
			if(s.charAt(i)=='-')
			{
			 flag=false;
			 break;
			}
	    }
		return flag;
	}
	private static String flipCakes(String s) 
	{
		// TODO Auto-generated method stub
		String string="";
		for(int i=0;i<s.length();i++)
	    {
			if(s.charAt(i)=='+')
			{
				string+='-';
			}
			else
			{
				string+='+';
			}
	    }
		return string;
	}
	

}
