package qr2014.CookieClickerAlpha;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CookieClickerAlpha {

	static Scanner sc;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			findTime(i);
			System.out.println();
		 }
	}
	private static void findTime(int caseNo) 
	{
		// TODO Auto-generated method stub
		double c=sc.nextDouble();
		double f=sc.nextDouble();
		double x=sc.nextDouble();
		double cps=2;
		double s=0,pMaxS=x/cps,cMaxS=0;
		do
		{
		 if(cMaxS!=0)
		 {
			pMaxS=cMaxS;
		 }
		 s+=c/cps;
		 cps+=f;
		 cMaxS=(x/cps)+s;
		}while(pMaxS>cMaxS);
		
		System.out.print("Case #"+caseNo+": "+pMaxS);
		
	}

}
