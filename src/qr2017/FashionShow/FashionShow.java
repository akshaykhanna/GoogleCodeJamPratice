package qr2017.FashionShow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FashionShow {
	
	//ak
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
		int n=sc.nextInt();
		int m=sc.nextInt();
		char a[][]=new char[n][n];
		int y=0,z=0;
		for(int i=0;i<m;i++)
		 {
			char temp=sc.next().charAt(0);
			//a[sc.nextInt()-1][sc.nextInt()-1]=sc.nextInt();
			int li=sc.nextInt()-1;
			int ri=sc.nextInt()-1;
			a[li][ri]=temp;
			if(temp=='o')
				y+=2;
			else
				y+=1;
		 }
		//printArray(a,n);
		String pma="";
		if(m<(n*n))
		{
			//for(int i=0;i<n;i++)
			 for(int i=n-1;i>=0;i--)
			 {
				//for(int j=0;j<n;j++)
				for(int j=n-1;j>=0;j--)
				{
				   if(a[i][j]=='o')
					   continue;
				   if(a[i][j]=='x' || a[i][j]=='+')
				   {
					   //add 'o'
					   if(rcCheck(i,j,a,n) && diagCheck(i,j,a,n))
					   {
						   y+=2-1;
						   z++;
						   a[i][j]='o';
						   //
							   pma+="\n";
						   pma+="o "+(i+1)+" "+(j+1);
					   }
				   }
				   else
				   {
					   //add 'o'
					   if(rcCheck(i,j,a,n) && diagCheck(i,j,a,n))
					   {
						   y+=2;
						   z++;
						   a[i][j]='o';
						   
							   pma+="\n";
						   pma+="o "+(i+1)+" "+(j+1);
					   }
					   //add '+'
					   else if(diagCheck(i,j,a,n))
					   {
						   y+=1;
						   z++;
						   a[i][j]='+';
						   
							   pma+="\n";
						   pma+="+ "+(i+1)+" "+(j+1);
					   }
					   //add 'x'
					   else if(rcCheck(i,j,a,n))
					   {
						   y+=1;
						   z++;
						   a[i][j]='x';
						   
							   pma+="\n";
						   pma+="x "+(i+1)+" "+(j+1);
					   }
				   }
				}
			 }
		}
		System.out.print("Case #"+caseNo+": "+y+" "+z);
		if(z>0)
		{
			System.out.print(pma);
		}
	}
	private static boolean diagCheck(int r, int c, char[][] a,int n) 
	{
		// TODO Auto-generated method stub
		boolean flag=false;
		boolean rcEmpty=true;
		boolean fb=false;
		int rcSum=r+c;
		//int rcDiff=Math.abs(r-c);
		int rcDiff=(r-c);
		//left diagonal
		for(int i=0;i<n;i++)
		 {
			fb=false;
			for(int j=0;j<n;j++)
			{
				if(i==r && j==c)
					continue;
				//if((i+j)==rcSum || (Math.abs(j-i))==rcDiff)
				if((i+j)==rcSum || (i-j)==rcDiff)
				{
					if(a[i][j]=='x')
					{
						flag=true;
						rcEmpty=false;
					}
					else if(a[i][j]=='o' || a[i][j]=='+')
					{
						flag=false;
						rcEmpty=false;
						fb=true;
						break;
					}
				}
			}
			if(fb)
				break;
			
		 }
		return flag||rcEmpty;
	}
	private static boolean rcCheck(int r, int c, char[][] a,int n) {
		// TODO Auto-generated method stub
		//row check
		boolean flag=false;
		boolean rcEmpty=true;
		//int symbOthThenPlus=0;
		for(int i=0;i<n;i++)
		 {
		  if(i==c)
			  continue;
		  if(a[r][i]=='+')
		  {
			  flag=true;
			  rcEmpty=false;
		  }
		  else if(a[r][i]=='x' || a[r][i]=='o')
		  {
			  flag=false;
			  rcEmpty=false;
			  break;
		  }
		 }
		if(!flag && !rcEmpty)
			return flag;
		else
		{
			flag=false;
			rcEmpty=true;
		}
		//check column
		for(int i=0;i<n;i++)
		 {
		  if(i==r)
			  continue;
		  if(a[i][c]=='+')
		  {
			  flag=true;
			  rcEmpty=false;
		  }
		  else if(a[i][c]=='x' || a[i][c]=='o')
		  {
			  flag=false;
			  rcEmpty=false;
			  break;
		  }
		 }
		return flag||rcEmpty;
	}
	private static void printArray(char[][] a,int n) 
	{
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<n;i++)
		 {
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		 }
	}

}
