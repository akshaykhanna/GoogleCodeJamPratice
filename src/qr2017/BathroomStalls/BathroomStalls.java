package qr2017.BathroomStalls;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class BathroomStalls {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 long t = sc.nextInt();
		 for(long i=1;i<=t;i++)
		 {
			 
			logic(i);
			System.out.println();
		 }
	}
	private static void logic(long caseNo) 
	{
		// TODO Auto-generated method stub
	   long n=sc.nextLong();
	   long k=sc.nextLong();
	   long l=0,r=0,si,lg=0,lgi=0,rg=0,temp=0,curr=0;
	   if(n>k)
	   {
		   char a[]=new char[(int) (n+2)];
		   //String a=genBlankStalls(n);
		   a[0]='o';
		   a[(int) (n+1)]='o';
		   /*
		   a='o'+a;
		   a=a+'o';
		   */
		   for(long kk=1;kk<=k;kk++)
			 {
			   si=0;
			   if(kk==1)
			   {
				   
				   si=n/2;
				   if(n%2!=0)
					   si++;
				   l=si-0-1;
				   r=n-si;
				  // ng=si;
			   } 
			   else
			   {
				  lg=0;
				  lgi=0;
				  //l=r=-1;
				  temp=0;
				  curr=-1;
				   for(long i=1;i<=n;i++)
				  {
					 if(a[(int) i]=='o')
					 // if(a.charAt((int)i)=='o')
					 {
						 lgi=i;
						 continue;
					 }
					 lg=i-lgi-1;
					 rg=findRightGurardDist(a,i+1);
					 temp=minF(lg,rg);
					 if(curr==-1 || temp>curr || (temp==curr && maxF(lg, rg)>maxF(l, r)))
					 {
						 curr=temp;
						 si=i;
						 l=lg;
						 r=rg;
					 } 
				  }
			   }
			   a[(int) si]='o';
			 } 
		   System.out.print("Case #"+caseNo+": "+maxF(l, r)+" "+minF(l, r));
		   //printArray(a);
		   return;
	   }
	   System.out.print("Case #"+caseNo+": 0 0");
	}

	private static String genBlankStalls(long n) 
	{
		// TODO Auto-generated method stub
		String string="";
		for(long i=0;i<n;i++)
		{
			string+=".";
		}
		return string;
	}
	private static void printArray(char[] a) 
	{
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			 System.out.print(a[i]);
		}
		System.out.println();
	}
	private static long findRightGurardDist(char[] a, long si) 
	{
		// TODO Auto-generated method stub(
		 for(int i=(int) si;i<a.length;i++)
		  {
			 if(a[i]=='o')
				 return (i-si);
		  }
		return 0;
	}
	private static long maxF(long l,long r)
	{
		if(l>r)
			return l;
		else
			return r;
	}
	private static long minF(long l,long r)
	{
		if(l<r)
			return l;
		else
			return r;
	}
}
