package OneA2016.RankAndFile;

import java.awt.geom.FlatteningPathIterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class RankAndFile {

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
		int m=(n*2)-1;
		int q[][]=new int[(n*2)-1][n];
		for(int i=0;i<(n*2)-1;i++)
		 {
			for(int j=0;j<n;j++)
			{
				q[i][j]=sc.nextInt();
			}
		 }
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int rfitm,ri=0,mri1=0,mri2=0;
		boolean mrf=false,aiuq=true;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			rfitm=q[0][i];
			ri=0;
			//serach r dat startts with rfitm
			mrf=false;
			for(int r=1;r<m;r++)
			{
				if(rfitm==q[r][0])
				{
					if(ri==0)
					{
					  ri=r;
					}
					else
					{
						mrf=true;
						//mri1=ri;
						mri2=r;
						//ri=r;
					}
					//break;
				}
			}
			//add that row to a;
			for(int j=0;j<n;j++)
			{
				a[j][i]=q[ri][j];
				if(!mrf)
				{
					b[j][i]=q[ri][j];
				}
				else
				{
					b[j][i]=q[mri2][j];
					//mrf=false;
				}
				if(map.containsKey(q[ri][j]))
				{
					aiuq=false;
				}
				else
				{
					map.put(q[ri][j], 1);
				}
				
			}
		}
		//print a
		//printArray(a,n);
		//printArray(b,n);
		if(!aiuq)
			a=b;
		//printArray(a,n);
		//find miss row
		boolean missrf=false,tf=false; int misri=0;
		for(int i=0;i<n;i++)
		{
			missrf=true;
			
			for(int j=0;j<m;j++)
			{
				if(a[i][0]==q[j][0])
				{
					tf=true;
					for(int k=0;k<n;k++)
					{
						if(a[i][k]!=q[j][k])
						{
							tf=false;
							break;
						}
					}
					if(tf)
						break;
				}
			}
			if(tf==false)
			{
				missrf=true;
				misri=i;
				break;
			}
		}
		//print miss row
		System.out.print("Case #"+caseNo+": ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[misri][i]+" ");
		}
	}
	private static void printArray(int[][] a,int n) 
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
