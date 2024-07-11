import java.io.*;
import java.util.*;
class pattern3
{
    public static void main(String args[])throws IOException
    {
        int i,j,x;
        Scanner sc=new Scanner(System.in);
         x=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
        System.out.print(x);
        x=x+1;
    }
    System.out.println();
    }sc.close();
}
}