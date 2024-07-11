import java.io.*;
import java.util.*;
class Goldbach
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int N,counta=0,countb=0;
        System.out.print("Enter a even number N=");
        N=sc.nextInt();
        System.out.println("The prime pairs are:");
        int a=N/2;
        if(N%2==0&&N>9&&N<50)
        {
        for(int i=2;i<=a;i++)
        {
            int c=N-i;
            for(int j=2;j<c;j++)
            {
                if(c%j==0)
                {
                    counta=counta+1;
                }
            }
            for(int k=2;k<i;k++)
            {
                if(i%k==0)
                {
                    countb=countb+1;;
                }
            }
            if(counta==0&&countb==0)
            {
                System.out.println(i+" , "+c);
            }
                counta=0;
                countb=0;
        }
        }
        else if(N%2!=0)
        {
            System.out.println("INVALID INPUT ,NUMBER IS ODD");
        }
         else
        {
            System.out.println("INVALID INPUT ,NUMBER IS OUT OF RANGE");
        }
        sc.close();
}
}

                
        
