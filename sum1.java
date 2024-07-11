import java.io.*;
import java.util.*;
class sum1
{
    public static void main(String args[])throws IOException
    {
        int a,n,i,j;
        double b,c,s=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the no.of terms");
        n=sc.nextInt();
        for(i=1;i<=n;i=i+2)
        {
            for(j=1;j<=n;j=j+4)
            {
                c=Math.pow(a,i);
                b=Math.pow(a,j);
                s=s+(c/i*2-1)-(b/j*2-1);
            }
        }
        System.out.print(s);
    }
}
       