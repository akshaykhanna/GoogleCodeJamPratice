package qr2013.Lawnmover;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lawnmover {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			checkPattern(i);
			System.out.println();
		 }
	}
	private static void checkPattern(int caseNo) 
	{
		// TODO Auto-generated method stub
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c+1],max;
		for(int i=0;i<r;i++)
		{
			max=-1;
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			a[i][c]=max;
			
		}
		boolean flag=true;
		int f=0,s=0;
		for(int i=0;i<c;i++)
		{
			//flag=true;
			for(int j=0;j<r-1;j++)
			{
			    f=a[j][i];
			    s=a[j+1][i];
				if(f!=s)
				{
				 if((f<s && f!=a[j][c])||(f>s && s!=a[j+1][c]))
				// if(a[j][i]!=a[j][c] || a[j+1][i]!=a[j+1][c])
				  {
					  flag=false;
					  break;
				  }
					  
				}
			}
			if(!flag)
				break;
		}
		if(flag)
			System.out.print("Case #"+caseNo+": YES");
		else
			System.out.print("Case #"+caseNo+": NO");
	}

}
