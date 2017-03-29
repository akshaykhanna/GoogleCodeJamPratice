package qr2015.standingOvation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandingOvation 
{
	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			additionalFriendsRequired(i);
			System.out.println();
		 }
	}
	private static void additionalFriendsRequired(int caseNo) 
	{
		// TODO Auto-generated method stub
		int sMax=sc.nextInt();
		String s=sc.next();
		
		long noOfStandingGuys=0;
		long noOfAdditionalFriendsNeeded=0;
		for(int i=0;i<s.length();i++)
		 {
			if(noOfStandingGuys>=sMax)
				break;
			if(s.charAt(i)=='0')
				continue;
			if(noOfStandingGuys>=i)
			{
				noOfStandingGuys+=(s.charAt(i)-'0');
			}
			else
			{
			  long extraFriendsRequiredAtThisSpot=i-noOfStandingGuys;
			  noOfAdditionalFriendsNeeded+=extraFriendsRequiredAtThisSpot;
			  noOfStandingGuys+=extraFriendsRequiredAtThisSpot+(s.charAt(i)-'0');
			}
		 }
		
		System.out.print("Case #"+caseNo+": "+noOfAdditionalFriendsNeeded);
	}

}
