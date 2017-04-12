package qr2013.TicTacToeT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA.IdentifierHelper;

public class TicTacToeT {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			 gameState(i);
			System.out.println();
		 }
	}
	private static void gameState(int caseNo) 
	{
		// TODO Auto-generated method stub
		char a[][]=new char[4][4];
		boolean isEmptyBitThere=false;
		for(int i=0;i<4;i++)
		{
			String string=sc.next();
			for(int j=0;j<4;j++)
			{
				a[i][j]=string.charAt(j);
				if(!isEmptyBitThere && a[i][j]=='.')
					isEmptyBitThere=true;
			}
		}
		char ch=findWinnerOrDraw(a);
		if(ch=='d')
		{
			if(isEmptyBitThere)
			{
				System.out.print("Case #"+caseNo+": Game has not completed");
			}
			else
				System.out.print("Case #"+caseNo+": Draw");		
		}
		else
		{
			System.out.print("Case #"+caseNo+": "+ch+" won");
		}
		
	}
	private static char findWinnerOrDraw(char[][] a) 
	{
		// TODO Auto-generated method stub
		boolean isWinner=false;
		char c='e';
		//row
		for(int i=0;i<4;i++)
		{
			isWinner=true;
			c='e';
			for(int j=0;j<4;j++)
			{
				if(a[i][j]=='T')
				{
				   continue;
				}
				if(c=='e' &&  a[i][j]!='.')
				{
				  c=a[i][j];
				  continue;
				}
				if(a[i][j]!=c || a[i][j]=='.')
				{
					isWinner=false;
					break;
				}
			}
			if(isWinner)
			{
				return c;
			}	
		}
		//column
		for(int j=0;j<4;j++)
		{
			isWinner=true;
			c='e';
			for(int i=0;i<4;i++)
			{
				if(a[i][j]=='T')
				{
				   continue;
				}
				if(c=='e' && a[i][j]!='.')
				{
				  c=a[i][j];
				  continue;
				}
				if(a[i][j]!=c || a[i][j]=='.')
				{
					isWinner=false;
					break;
				}
			}
			if(isWinner)
			{
				return c;
			}	
		}
		//for left diagonal
		isWinner=true;
		c='e';
		for(int i=0;i<4;i++)
		{
			if(a[i][i]=='T')
			{
			   continue;
			}
			if(c=='e'&& a[i][i]!='.')
			{
			  c=a[i][i];
			  continue;
			}
			if(a[i][i]!=c || a[i][i]=='.')
			{
				isWinner=false;
				break;
			}
		}
		if(isWinner)
		{
			return c;
		}
		//for right diagonal
		isWinner=true;
		c='e';
		for(int i=3;i>=0;i--)
		{
			if(a[3-i][i]=='T')
			{
			   continue;
			}
			if(c=='e' && a[3-i][i]!='.')
			{
			  c=a[3-i][i];
			  continue;
			}
			if(a[3-i][i]!=c || a[3-i][i]=='.')
			{
				isWinner=false;
				break;
			}
		}
		if(isWinner)
		{
			return c;
		}
		else
			return 'd';
	}
}