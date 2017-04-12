package OneA2016.RankAndFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import OneA2016.TheLastWord.A;

public class B {

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
		int n=sc.nextInt();
		int m=(n*2)-1;
		//int q[][]=new int[(n*2)-1][n];
		int h[]=new int[2500];
		for(int i=0;i<m;i++)
		 {
			for(int j=0;j<n;j++)
			{
				h[sc.nextInt()-1]++;
			}
		 }
		//int o[]=new int[n];
		int k=0;
		System.out.print("Case #"+caseNo+": ");
		for(int i=0;i<2500;i++)
		{
			if(h[i]%2!=0)
			{
				//o[k++]=i+1;
				System.out.print((i+1));
				k++;
				if(k>=n)
					break;
				System.out.print(" ");
			}
			
		}
		/*
		//print miss row
		System.out.print("Case #"+caseNo+": ");
		for(int i=0;i<n;i++)
		{
		 System.out.print(o[i]+" ");
		}
		*/
	}

}
