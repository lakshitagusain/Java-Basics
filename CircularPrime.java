import java.util.*;
class CircularPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,count=0,flag=0,p=0,c,newno;
        System.out.print("Enter the number=");
        N=sc.nextInt();
        int a=N;
        double b=N;
        while(a>0)
        {
            count+=1;
            a=a/10;
        }
        for(int i=1;i<=count;i++)
        {
            c=(int)(b/Math.pow(10,count-1));
            newno=(int)(b%(Math.pow(10,count-1)))*10+c;
            System.out.println(newno);
            for(int j=2;j<newno;j++)
            {
                if(newno%j==0)
                {
                    flag=flag+1;
                }
            }
            if(flag==0)
            {
                p++;
            }
            b=newno;
        }
        if(p==count)
        {System.out.println(N+" is a circular prime");
        }
        else
        System.out.println(N+" is not a circular prime");
        sc.close();
    }
}
            
