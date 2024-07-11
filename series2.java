import java.io.*;
import java.util.*;
class series2
{
    public static void main(String args[])throws IOException
    {
        int i,s,t,f;
        Scanner sc=new Scanner(System.in);
        f=0;
        s=1;
       System.out.print(f+",");
       System.out.print(s+",");
        for(i=1;i<=8;i++)
        {
            t=f+s;
            System.out.print(t);
            System.out.print(",");
        f=s;
        s=t;
        sc.close();
    }
}
}