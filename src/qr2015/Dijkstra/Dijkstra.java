package qr2015.Dijkstra;

import java.awt.geom.Ellipse2D;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dijkstra {

	static Scanner sc;
	static char a[][];
	static HashMap<String,Integer> map;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		map=new HashMap<String,Integer>();
		map.put("1", 0);
		map.put("i", 1);
		map.put("j", 2);
		map.put("k", 3);
		//a=new String[4][4];
		//a[0]={'1','i','j','k'},{'1','i','j','k'},{'1','i','j','k'},{'1','i','j','k'}};
		
		int t = sc.nextInt();
		 for(int i=1;i<=t;i++)
		 {
			 
			check(i);
			System.out.println();
		 }
	}
	private static void check(int caseNo) 
	{
		// TODO Auto-generated method stub
		int l=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		//boolean posssible=false,flag=false;
		if((l*k)>=3)
		{
		  String fS=makeFullString(s,k);
		  int si=0;
		  //check for i
		  si=searchForIJK("i",si,fS);
		  if(si!=-1)
		  {
			  si=searchForIJK("j",si,fS);
			  if(si!=-1)
			  {
				 si=searchForIJK("k",si,fS);
				 if(si!=-1)
				 {
					 System.out.print("Case #"+caseNo+": YES");
					 return ;
				 }
			  }
		  }
		}
		 System.out.print("Case #"+caseNo+": NO");
	}
	private static int searchForIJK(String ijk, int si,String fS) 
	{
		// TODO Auto-generated method stub
		int fsl=fS.length();
		int li=fsl;
		boolean flag=false;
		if(ijk=="i")
		{
			li=fsl-2;
		}
		else if(ijk=="j")
		{
			li=fsl-1;
		}
		String sub="";
		 for(int i=si;i<li;i++)
		  {
			  //String sub=fS.substring(si, i+1);
			  sub=sub+fS.substring(i, i+1);
			  sub=reduceFS(sub);
			 
			  if(sub.equalsIgnoreCase(ijk))
			  {
				  flag=true;
				  si=i+1;
				  break;
			  }	
			  
		  }
		 if(!flag)
		 {
			 si=-1;
		 }
		return si;
	}
	private static String reduceFS(String sub) 
	{
		// TODO Auto-generated method stub
		int len=sub.length();
		if(len==1)
		{
			return sub;
		}
		int i=1;
		char s1=sub.charAt(0),s2='0';
		char a[][]={{'1','i','j','k'},{'i','1','k','j'},{'j','k','1','i'},{'k','j','i','1'}};
		while(i<len)
		{
			s2=sub.charAt(i);
			s2=a[map.get(s1+"")][map.get(s2+"")];
			i++;
			s1=s2;
				
		}
		return s1+"";
	}
	private static String makeFullString(String s, int k) 
	{
		// TODO Auto-generated method stub
		String string="";
		while(k>0)
		{
			string+=s;
			k--;
		}
		return string;
	}

}
