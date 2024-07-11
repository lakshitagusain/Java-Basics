import java.io.*;
import java.util.*;
class Sum
{
    public static void main(String args[])throws IOException
    {
        int r,a,b,c,d,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        r=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        sum=sc.nextInt();
        a=r/100;
        b=r%100;
        c=b/10;
        d=b%10;
        sum=a+c+d;
        System.out.println("sum="+sum);
        sc.close();
    }
}