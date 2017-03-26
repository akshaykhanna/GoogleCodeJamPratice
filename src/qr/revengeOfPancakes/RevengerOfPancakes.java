package qr.revengeOfPancakes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RevengerOfPancakes 
{
	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			 findNumberOfManeuver(i);
			System.out.println();
		 }
	}
	private static void findNumberOfManeuver(int caseNo)
	{
		// TODO Auto-generated method stub
	    String s= sc.next();
	    char c1,c2;
	    long maneuver=0;
	    int l=s.length();
	    if(l==1)
	    {
	    	if(s.charAt(0)=='-')
	    		maneuver++;
	    	System.out.print("Case #"+caseNo+": "+maneuver);
	    	return;
	    }
	    
	    for(int i=0;i<l-1;i++)
	    {
	      c1=s.charAt(i);
	      c2=s.charAt(i+1);
	      if(c1=='-' && c2=='-')
	      {
	    	 maneuver++;
	    	 
	    	 //handle consecutive '-'
	    	 int j=i+2;
	    	 while(j<l && s.charAt(j)=='-')
	    	 {
	    		 j++;
	    	 }
	    	 i=j-1;
	    	 
	      }
	      else if(c1=='+' && c2=='-')
	      {
	    	  maneuver+=2;
	    	  
	    	  //handle consecutive '-'
		    	 int j=i+2;
		    	 while(j<l && s.charAt(j)=='-')
		    	 {
		    		 j++;
		    	 }
		    	 i=j-1;
	      }
	      else if(c1=='-' && c2=='+')
	      {
	    	  maneuver++;
	      }
	    	  
	    }
	    
	    System.out.print("Case #"+caseNo+": "+maneuver);
	}

}
