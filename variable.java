import java.io.*;
import java.util.*;
class variable
{
    public static void main (String args[])throws IOException
    {
        int a=4,b=7,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=sc.nextInt();
        System.out.println("enter the value of b:");
        b=sc.nextInt();
        c=a+b;
        d=a*b;
        System.out.println("the sum="+c);
        System.out.println("the product="+d);
        System.out.println("e^sum="+Math.exp(c));
        sc.close();
    }
}