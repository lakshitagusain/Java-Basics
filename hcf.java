import java.io.*;
import java.util.*;
class hcf
{
    public static void main(String args[])throws IOException
    {
        int x,y,p,i,h,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of first no.");
        x=sc.nextInt();
        System.out.println("enter the value of the second no.");
        y=sc.nextInt();
        h=sc.nextInt();
        l=sc.nextInt();
        p=x*y;
        for(i=1;i<=p;i++)
        {if(x%i==0&&y%i==0)
            {
                h=i;
            }
        }
        System.out.println("hcf="+h);
        l=p/h;
        System.out.println("lcm="+l);
        sc.close();
     }
}
