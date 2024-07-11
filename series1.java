import java.io.*;
import java.util.*;
class series1
{
    public static void main(String args[])throws IOException
    {
        int i,s=0;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=6;i++)
        {
            s=s*10+i;
        System.out.print(s);
        System.out.print(",");
        sc.close();
    }
}
}