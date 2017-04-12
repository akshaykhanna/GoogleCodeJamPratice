package qr2015.InfiniteHouseOfPancakes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InfiniteHouseOfPancakes 
{

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			calculateTime(i);
			System.out.println();
		 }
	}
	private static void calculateTime(int caseNo) 
	{
		// TODO Auto-generated method stub
		int d=sc.nextInt();
		//int a[]=new int[d];
		int max=-1,temp=0;
		for(int i=0;i<d;i++)
		{
		 // a[i]=sc.nextInt();
		   temp=sc.nextInt();
		  if(temp>max)
		  {
			  max=temp;
		  }
		}
		int time=0;
		if(max%2!=0)
		{
			time++;
			max--;
		}
		while(max>2)
		{
			max/=2;
			time++;
		}
		time+=max;
		
		System.out.print("Case #"+caseNo+": "+time);
	}
}
