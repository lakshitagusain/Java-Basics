import java.io.*;
import java.util.*;
class Area
{
    public static void main(String args[])throws IOException
    {
        int ch,l,b,h,r,ba;
        double ar1=0.0,ar2=0.0,ar3=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length=");
        l=sc.nextInt();
        System.out.println("enter the breadth");
        b=sc.nextInt();
        System.out.println("enter the height");
        h=sc.nextInt();
        System.out.println("enter the radius");
        r=sc.nextInt();
        System.out.println("enter the base");
        ba=sc.nextInt();
        System.out.println("enter your choice");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1:
            ar1=3.4*r*r;
            System.out.println("area of circle="+ar1);
            break;
            case 2:
            ar2=ba*h*1/2;
            System.out.println("area of the triangle="+ar2);
            break;
            case 3:
            ar3=l*b;
            System.out.println("area of the rectangle="+ar3);
            break;
        }
        sc.close();
    }
}
           