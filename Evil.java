import java.io.*;
import java.util.*;
class Evil
{
    public static void main(String args[])throws IOException
    {
        int N,a,sum=0,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 2 and 100");
        N=sc.nextInt();
        if(N>2&&N<100)
        {
            while (N>0)
            {
                sum=(sum)*10+N%2;
                N=N/2;
            }
            while(sum>0)
            {
                a=sum%10;
                if(a==1)
                {count++;}
                sum=sum/10;
            }
            System.out.println("number of 1="+count);
            if(count%2==0)
            {System.out.println("EVIL NUMBER");
            }
            else
            {System.out.println("NOT AN EVIL NUMBER");
            }
        }
        else
        System.out.println("NUMBER OUT OF RANGE");
        sc.close();
    }
}
               