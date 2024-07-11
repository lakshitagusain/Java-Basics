import java.io.*;
import java.util.*;
class pattern2
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
            System.out.print(j);
            }
        System.out.println();
     }
     sc.close();
}
}