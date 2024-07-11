import java.io.*;
class Armstrong
{
    public static void main(String args[])throws IOException
    {
        int r,a,b,c,d;
        double e,f,g,sum;
        System.out.println("All armstrong numbers between 100 and 999");
        for(r=100;r<=999;r++)
        {
        a=r/100;
        b=r%100;
        c=b/10;
        d=b%10;
        e=Math.pow(a,3);
        f=Math.pow(c,3);
        g=Math.pow(d,3);
        sum=e+f+g;
        if(sum==r)
        System.out.println(r);
        }
    }
}