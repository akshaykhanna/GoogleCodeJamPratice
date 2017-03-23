package qualification.round;

import java.util.Scanner;
import java.io.*;

public class StandarInputOutput 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		    for (int i = 1; i <= t; ++i) 
		    {
		      int n = in.nextInt();
		      int m = in.nextInt();
		      System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
		    }
	}

}
