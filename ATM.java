import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int x;
		double y;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextDouble();
		if((x%5==0)&&(x+0.5<=y))
		{
		    System.out.print(y-x-0.5);
		}
		else
		{
		    System.out.print(y);
		}
		
	}
}