
import java.util.*;
import java.lang.*;
import java.io.*;
public class INTEST
{
    public static void main(String[] args)
    {
        int n ;
        int ans=0;
        int k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
         k=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=s.nextInt();
            if(t%k==0)
            {
                ans++;
            }
        }
        System.out.println(ans);
        
    }
}
