package counting.sheep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep
{
	private static Scanner sc;
	static int count;
	static HashSet<Integer> seen;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			 findNumber(i);
			 System.out.println();
		 }
	}

	private static void findNumber(int caseNo) 
	{
		// TODO Auto-generated method stub
		//System.out.print("Case#"+caseNo+": ");
		int n=sc.nextInt();
		if(n==0)
			System.out.print("Case #"+caseNo+": INSOMNIA");
		else
		{
			//intialize for every case
			count=0;
			seen=new HashSet<Integer>();
			
			long lastNo=n;
			int i=1;
			while(count<10)
			{
			  lastNo=n*i;
			  divideNoInPartsAndIncCounter(lastNo);
			  i++;
			}
			System.out.print("Case #"+caseNo+": "+lastNo);
		}
	}

	private static void divideNoInPartsAndIncCounter(long lastNo) 
	{
		// TODO Auto-generated method stub
		int a;
		while(lastNo>0 && count<=10)
		{
			a=(int)lastNo%10;
			checkIncCounterIfNoIsNotPresentInHashMap(a);
			lastNo/=10;
		}
		
	}

	private static void checkIncCounterIfNoIsNotPresentInHashMap(int a) 
	{
		// TODO Auto-generated method stub
		if(!seen.contains(a))
		{
			seen.add(a);
			count++;
		}
	}

}
