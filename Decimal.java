import java.io.*;
import java.util.*;
class Decimal
{
    public static void main(String args[])throws IOException
    {
        int n,rem,i;
        double s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        i=0;
        while(n>0)
        {
            rem=n%10;
            s=s+(rem*Math.pow(2,i));
            i++;
            n=n/10;
        }
            System.out.println(s);
            sc.close();
        }
}
