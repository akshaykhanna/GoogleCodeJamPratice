package qr2015.OminousOmino;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OminousOmino {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			findWhoWins(i);
			System.out.println();
		 }
	}
	private static void findWhoWins(int caseNo) 
	{
		// TODO Auto-generated method stub
		int x=sc.nextInt();	
		int r=sc.nextInt();	
		int c=sc.nextInt();	
		String winner="GABRIEL";
		if((r*c)%x!=0)
		{
			winner="RICHARD";
		}
		else 
		{
			//make possible X which makes it unfit
			int maxWofX=x, maxHofX=0;
			while(maxWofX>=maxHofX)
			{
				if(maxWofX>c || maxHofX>r)
				{
					winner="RICHARD";
					break;
				}
				maxWofX--;
				maxHofX++;
			}
		}
		
		System.out.print("Case #"+caseNo+": "+winner);
	}

}
