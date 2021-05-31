
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solubility
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans;
		for(int i=0;i<n;i++)
		{
		    int x;
		    int a;
		    int b;
		    x=s.nextInt();
		    a=s.nextInt();
		    b=s.nextInt();
		    System.out.print((a+((100-x)*b))*10);
		}
	}
}
