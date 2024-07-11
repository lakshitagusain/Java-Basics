import java.util.*;
class Compomagic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,count2=0;
        System.out.println("Enter the lower limit:");
        m=sc.nextInt();
        System.out.println("Enter the upper limit:");
        n=sc.nextInt();
        System.out.println("the composite magic integers are:");
        for(int i=m;i<=n;i++)
        {int count1=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count1++;
                 
                }
            }
            if(count1>0)
            {
                int a=i;
                while(a>9)
                {int sum=0;
                   while(a>0)
                   {
                     int b=a%10;
                     sum=sum+b;
                     a=a/10;
                   }
                   if(sum==1)
                    {
                        System.out.println(i);
                        count2++;
                        break;
                    }
                    else
                    {
                        a=sum;
                        if(a<10)
                        {break;}
                    }
                }
            }
        }
         System.out.println(count2+" is the no. ofcomposite magic integers.");
         sc.close();
        }
    }

                    