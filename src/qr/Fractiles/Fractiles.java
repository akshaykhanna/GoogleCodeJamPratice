package qr.Fractiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fractiles 
{
	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		 int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			setOfTiles(i);
			System.out.println();
		 }

	}
	private static void setOfTiles(int caseNo) 
	{
		// TODO Auto-generated method stub
		int k=sc.nextInt();
		int c=sc.nextInt();
		int s=sc.nextInt();
		String sq[]=new String[(int)Math.pow(k, c)];
		generateSequences(sq,k,c);
		displaySequences(sq);
		
	}
	private static void displaySequences(String[] sq) 
	{
		// TODO Auto-generated method stub
		int i=0;
		while(sq[i]!=null)
		{
			System.out.println(sq[i]);
			i++;
		}
	}
	private static void generateSequences(String[] sq, int k, int c) 
	{
		// TODO Auto-generated method stub
		int ai=0;
		String orgSq="",nextSq;
		orgSq=generateKTimesG(k);
		 int j=0,cc;
		 while(j<=k)
		 {
			nextSq=orgSq;
			cc=c;
			while(cc>1)
			{
				cc--;
				nextSq=generateFractals(nextSq,orgSq);
			}
			//adding seq to array
			sq[ai++]=nextSq;
			
			orgSq=orgSq.substring(0,j)+ "L"+ (j<k ? orgSq.substring(j+1):"");
				//orgSq+=orgSq.substring(j+1);
			j++;
		 }
			 
	}
	private static String generateFractals(String currSq,String orgSq) 
	{
		// TODO Auto-generated method stub
		String nextSq="";
		for(int i=0;i<currSq.length();i++)
		{
			if(currSq.charAt(i)=='G')
			{
				nextSq+=generateKTimesG(orgSq.length());
			}
			else if(currSq.charAt(i)=='L')
			{
				nextSq+=orgSq;
			}
		}
		return nextSq;
	}
	private static String generateKTimesG(int k) 
	{
		// TODO Auto-generated method stub
		String orgSq="";
		 for(int i=1;i<=k;i++)
			 orgSq+="G";
		 return orgSq;
	}
	

}
