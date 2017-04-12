package qr2014.MagicTrick;

import java.awt.geom.Ellipse2D;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class MagicTrick {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			findCard(i);
			System.out.println();
		 }
	}
	private static void findCard(int caseNo) 
	{
		// TODO Auto-generated method stub
		int r1=sc.nextInt()-1 ,temp=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int ll=r1*4, ul=(r1+1)*4;
		for(int i=0;i<16;i++)
		{
			temp=sc.nextInt();
			if(i>=ll && i<ul)
			{
				map.put(temp,1);
			}
		}
		int r2=sc.nextInt()-1,c=0,cardNo=0;
		ll=r2*4;
		ul=(r2+1)*4;
		for(int i=0;i<16;i++)
		{
			temp=sc.nextInt();
			if(c>1)
				continue;
			if(i>=ll && i<ul)
			{
				if(map.containsKey(temp))
				{
					c++;
					cardNo=temp;
				}
					
			}
			
		}
		String out="";
		if(c==1)
		{
			out+=cardNo;
		}
		else if(c>1)
		{
			out="Bad magician!";
		}
		else
		{
			out="Volunteer cheated!";
		}
		System.out.print("Case #"+caseNo+": "+out);
	}
	

}
