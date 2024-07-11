import java.util.*;
class Primeadam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,frequency=0;
        System.out.print("m=");
        m=sc.nextInt();
        System.out.print("n=");
        n=sc.nextInt();
        if(m<n)
        {
            System.out.println("PRIME-ADAM NUMBERS ARE:");
            for(int i=m;i<=n;i++)
            {
                int count=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                }
                if(count==0)
                {
                    int a=i;
                    int b=i*i;
                    int square=b;
                    int c,d,newno=0,nsquare=0;
                    while(a>0)
                    {
                        c=a%10;
                        newno=newno*10+c;
                        a=a/10;
                    }
                    while(square>0)
                    {
                        d=square%10;
                        nsquare=nsquare*10+d;
                        square=square/10;
                    }
                    int ns=newno*newno;
                    if(ns==nsquare)
                    {
                       System.out.print(i+"   ");
                       frequency++;
                    }
                }
            }
            if(frequency==0)
            {
                System.out.print("NIL");
            }
            System.out.println();
            System.out.println("FREQUENCY OF PRIME-ADAM NUMBERS IS :"+frequency);
        }
        else
            {
                System.out.println("INVALID INPUT");
            }
            sc.close();
        }
    }
            
            