import java.io.*;
import java.util.*;
class binary
{
    public static void main(String args[])throws IOException
    {
        int n,rem,rev=0,b,a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%2;
            a=a*10+rem;
            n=n/2;
        }
        while(a>0)
        {
            b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
            System.out.println("no. in binary form="+rev);
            sc.close();
    }
}
